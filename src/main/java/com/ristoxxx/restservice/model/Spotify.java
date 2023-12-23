package com.ristoxxx.restservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Spotify {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    private String spotify;

    public String getGenre() {
        return spotify;
    }

    public void setGenre(String genre) {
        this.spotify = genre;
    }

   
    
}