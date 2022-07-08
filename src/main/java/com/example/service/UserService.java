package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.User;

@Service
public class UserService {

	List<User> list = new ArrayList<>();

	

	public UserService() {
		list.add(new User("user","user@gmail.com", "user123", "USER"));
		list.add(new User("admin","admin@gmail.com", "admin123", "ADMIN"));
	}

	// get all users
	public List<User> getAllUsers() {
		return this.list;
	}

//	// get single user
	public User getUser(String fName) {
		return this.list.stream().filter((user) -> user.getUsername().equals(fName)).findAny().orElse(null);

	}
	//add new user
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
