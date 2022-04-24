package com.example.demo.entities;

import java.util.List;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "meaning")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Meaning {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

//	@Column(name = "en_word_id")
//	private int enWordId;
//
//	@Column(name = "part_of_speech_id")
//	private int partOfSpeechId;

	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	@ManyToOne
	@JoinColumn(name = "en_word_id", updatable = false, insertable = false)
	private EnWord enWord;

//	@Getter(value = AccessLevel.NONE)
//	@Setter(value = AccessLevel.NONE)
	@ManyToOne
	@JoinColumn(name = "part_of_speech_id", updatable = false, insertable = false)
	private PartOfSpeech partOfSpeech;

	@Column(name = "meaning")
	private String meaning;

	
	@OneToMany(mappedBy = "meaning")
	private List<Example> examples;
}
