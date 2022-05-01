package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "saved_word")
@Getter
@Setter
public class SavedWord {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	@ManyToOne
	@JoinColumn(name = "word_id")
	private EnWord enWord;
	
}
