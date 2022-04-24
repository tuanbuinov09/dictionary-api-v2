package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entities.EnWord;
import com.example.demo.repositories.EnWordRepository;
import com.example.demo.service.EnWordService;

@Service
public class EnWordServiceImpl implements EnWordService {

	private EnWordRepository repository;

	public EnWordServiceImpl(EnWordRepository repository) {
		this.repository = repository;
	}

	public EnWord save(EnWord enWord) {
		return repository.save(enWord);
	}
}
