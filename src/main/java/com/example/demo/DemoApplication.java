package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/ola")
	public String ola(@RequestParam(value = "nome", defaultValue = "Mundo") String nome) {
		return String.format("Olá %s!", nome);
//		return "<html><body><marquee>Teste</marquee></body></html>";
	}
}