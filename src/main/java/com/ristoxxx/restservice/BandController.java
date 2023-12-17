package com.ristoxxx.restservice;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ristoxxx.restservice.model.Band;

@RestController
@RequestMapping(path = "/bands")
public class BandController {

    @Autowired
    private BandRepository bandRepository;

    @GetMapping("/{id}")
    public Optional<Band> getBandById(@PathVariable Integer bandId) {
        return bandRepository.findById(bandId);
    }

    @GetMapping()
    public Iterable<Band> getBands() {
        return bandRepository.findAll();
    }

    @PostMapping("/add")
    public Band createBand(@Validated @RequestBody Band band) {
        return bandRepository.save(band);
    }
}
