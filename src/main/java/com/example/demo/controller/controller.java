package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	
	
	@GetMapping("/login")
	String login() {
		
		
		return "Login SUcessfullyyyyyyyyyyyyyyyyyyyyy";
	}
	

}
