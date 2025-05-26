package com.boot.ejemplo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BienvenidaController {
	@GetMapping(value = "bienvenida", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Bienvenido a mí microservicio Spring Boot";
	}
}
