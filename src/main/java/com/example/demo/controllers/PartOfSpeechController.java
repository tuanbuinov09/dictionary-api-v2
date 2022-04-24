package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.PartOfSpeech;
import com.example.demo.repositories.PartOfSpeechRepository;

@RestController
public class PartOfSpeechController {
	private final PartOfSpeechRepository repository;

	public PartOfSpeechController(PartOfSpeechRepository repository) {
		// TODO Auto-generated constructor stub
		this.repository = repository;
	}

	@GetMapping("/partOfSpeeches")
	public List<PartOfSpeech> all() {
		return repository.findAll();
	}
}
