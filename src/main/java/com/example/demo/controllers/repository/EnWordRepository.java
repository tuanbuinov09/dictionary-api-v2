package com.example.demo.controllers.repository;

import com.example.demo.controllers.entities.EnWord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnWordRepository extends JpaRepository<EnWord, Long> {

}