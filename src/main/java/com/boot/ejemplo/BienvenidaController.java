package com.boot.ejemplo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BienvenidaController {
	
	@GetMapping("/bienvenida")
    public BienvenidaDTO saludo() {
        return new BienvenidaDTO("Bienvenido a mí microservicio Spring Boot");
    }
}
