package com.ristoxxx.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bands")
public class BandController {

    @Autowired
    private BandRepository bandRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Band> getBandById(@PathVariable(value = "id") Long bandId) {
        Band band = bandRepository.findById(bandId)
                .orElse(new ResourceNotFoundExeption ("Band not found for this id :: " + bandId));
        return ResponseEntity.ok().body(band);
    }

    @PostMapping("/add")
    public Band createBand(@Validated @RequestBody Band band) {
        return bandRepository.save(band);
    }
}
