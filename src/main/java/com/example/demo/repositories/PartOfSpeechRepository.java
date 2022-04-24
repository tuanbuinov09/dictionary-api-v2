package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.PartOfSpeech;

public interface PartOfSpeechRepository extends JpaRepository<PartOfSpeech, Integer> {

}
