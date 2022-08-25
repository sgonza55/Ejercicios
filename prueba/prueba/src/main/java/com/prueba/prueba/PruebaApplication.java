package com.prueba.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PruebaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
		//System.out.println("Hola Santi");
	}
	@GetMapping("/Santi") //http://localhost:8080/Santi
	public String hello(@RequestParam(value ="name",defaultValue = "World") String name) {
		//name = "Santiago";
		//Otra opcion es hacer el Request con ?name=SANTIAGO
		return String.format("Hola %s!", name);
	}

}
