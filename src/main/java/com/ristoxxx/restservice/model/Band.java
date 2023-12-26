package com.ristoxxx.restservice.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import com.ristoxxx.restservice.model.Memeber;	
import com.ristoxxx.restservice.model.Genre;	

@Entity
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String city;
    private Genre genre;
  

	private ArrayList<Memeber> members = new ArrayList<Memeber>();
   
	private String spotifyUrl;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public ArrayList<Memeber> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<Memeber> members) {
		this.members = members;
	}
	


	
	public String getSpotifyUrl() {
		return spotifyUrl;
	}
	
	public void setSpotifyUrl(String spotifyUrl) {
		this.spotifyUrl = spotifyUrl;
	}

	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

    // getters and setters
}