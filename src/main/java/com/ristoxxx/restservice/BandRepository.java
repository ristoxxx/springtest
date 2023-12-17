package com.ristoxxx.restservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ristoxxx.restservice.model.Band;

public interface BandRepository extends JpaRepository<Band, Integer> {

}
