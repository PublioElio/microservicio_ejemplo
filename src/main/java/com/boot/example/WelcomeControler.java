package com.boot.example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControler {

	@GetMapping("/welcome")
	public WelcomeDTO greeting() {
		return new WelcomeDTO("Welcome to my Spring Boot service");
	}

	@GetMapping(value = "welcome/{name}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String customGreeting(@PathVariable String name) {
		if (name == null || name.isBlank()) {
			return "Please provide a valid name!";
		}
		return "Welcome to my Spring Boot service, " + name + "!";
	}

	@GetMapping(value = "customgreeting", produces = MediaType.TEXT_PLAIN_VALUE)
	public String customGreeting(@RequestParam(required = false, defaultValue = "Guest") String name,
			@RequestParam(required = false, defaultValue = "42") int age) {
		return "Welcome, " + name + " you are " + age + " years old.";
	}
}
