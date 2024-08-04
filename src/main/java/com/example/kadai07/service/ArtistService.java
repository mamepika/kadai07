package com.example.kadai07.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kadai07.entity.Artist;
import com.example.kadai07.repository.ArtistRepository;

@Service
public class ArtistService {
	
	private final ArtistRepository artistRepository;
	
	@Autowired
	public ArtistService(ArtistRepository artistRepository) {
		this.artistRepository = artistRepository;
	}
	
	
	public List<Artist> findAll(){
		return this.artistRepository.findAll();
	}

}
