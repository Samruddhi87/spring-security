package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:3000" , exposedHeaders = "Access-Control-Allow-Origin")
public class UserController {
	
@Autowired
	private UserService userService;
	
//all user
	
	@GetMapping("/get")
	public List<User>getAllUser(){
		return this.userService.getAllUsers();
	}
	@GetMapping("/{email}")
	public User getUser( @PathVariable("email") String email) {
		return this.userService.getUser(email);
	}
	@PostMapping("/post")
	public User add(@RequestBody User user) {
		return this.userService.addUser(user);
	}
}
