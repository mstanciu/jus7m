package com.onlinestore.realsecure.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Demo {

	@Value("${welcome.message}")
	private String message;
	
	@GetMapping("/welcome")
	public String welcomeMessage() {
		return this.message;
	}
}
