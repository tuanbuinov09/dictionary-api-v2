package com.example.demo.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "[user]")
public class User {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "fullname")
	private String fullName;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;

	@OneToMany(mappedBy = "user")
	private List<UserRole> userRoleList;
	
	@OneToMany(mappedBy = "enWord")
	private List<SavedWord> savedWordList;
	
}
