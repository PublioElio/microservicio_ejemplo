package com.boot.ejemplo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControler {
	
	@GetMapping("/welcome")
    public WelcomeDTO greeting() {
        return new WelcomeDTO("Welcome to my Spring Boot service");
    }
	
	@GetMapping(value="welcome/{name}", produces=MediaType.TEXT_PLAIN_VALUE)
	public String customWelcome(String name) {
		return "¡Welcome to my Spring Boot service " + name +"!";
	}
}
