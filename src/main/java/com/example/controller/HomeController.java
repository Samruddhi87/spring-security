package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/public")
public class HomeController {
	@GetMapping("/user")
	public String user() {
		return "this is user page";
	}
	@GetMapping("/admin")
	public String admin() {
		return "this is user page";
	}

}
