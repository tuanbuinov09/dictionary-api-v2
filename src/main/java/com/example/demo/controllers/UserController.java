package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.EnWord;
import com.example.demo.entities.User;
import com.example.demo.exception.EnWordNotFoundException;
import com.example.demo.repositories.EnWordRepository;
import com.example.demo.repositories.UserRepository;

@RestController
public class UserController {

	@Autowired
	private final UserRepository repository;

	public UserController(UserRepository repository) {
		// TODO Auto-generated constructor stub
		this.repository = repository;
	}

	@GetMapping("enwords/{id}")
	User one(@PathVariable int id) {
		User user = repository.findById(id).orElseThrow(() -> new EnWordNotFoundException(id));
		return user;
	}
}
