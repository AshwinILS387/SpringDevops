package com.example.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class GreetController {
	
	@GetMapping("/welcome")
	public String greet() {
		return "<h1>Hai Aswin Raj..!!</h1>";
	}

}
