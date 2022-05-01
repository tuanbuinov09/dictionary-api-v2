package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.EnWord;
import com.example.demo.entities.SavedWord;

public interface SavedWordRepository extends JpaRepository<SavedWord, Integer> {
	
	@Query("SELECT e FROM EnWord e WHERE e.id IN (SELECT s.enWord FROM SavedWord as s inner join User as u on u.id=s.user where u.id=?1)")
	List<EnWord> findSavedWord(int userId);
}
