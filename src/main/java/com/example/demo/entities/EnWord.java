package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "en_word")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnWord {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "word")
	private String word;

	@Column(name = "views")
	private int views;

	@Column(name = "pronunciation")
	private String pronunciation;		

	@OneToMany(mappedBy = "enWord", fetch = FetchType.EAGER)
	private List<Meaning> meanings;
}
