package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.EnWord;

public interface EnWordRepository extends JpaRepository<EnWord, Integer> {
}
