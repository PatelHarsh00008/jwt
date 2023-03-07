package com.harsh.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	@GetMapping("/helloAdmin")
	public String helloAdmin() {
		return "Hello Admin";
	}
	
	@GetMapping("/helloUser")
	public String helloUser() {
		return "Hello User";
	}
}
