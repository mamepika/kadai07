package com.example.kadai07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.kadai07.service.ArtistService;

@Controller
public class ArtistController {
	
	private final ArtistService artistService;
	
	public ArtistController(ArtistService artistService) {
		this.artistService = artistService;
	}
	@GetMapping("/artists")
	public String getArtists(Model model) {
		var artists = this.artistService.findAll();
		System.out.println(artists.size());
		model.addAttribute("artists",artists);
		return "aritsts";
	}
	
	@GetMapping("/artists/{id}")
	public String findById(@PathVariable Long id, Model model) {
		
		return "artists/detail";
	}

}
