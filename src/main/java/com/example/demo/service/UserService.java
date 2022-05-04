package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Role;
import com.example.demo.entities.User;

public interface UserService {
	User saveUser(User user);

	Role saveRole(Role role);

	void addRoleToUser(String username, String roleName);

	User getUser(String username);

	List<User> getUsers();
	
	
}
