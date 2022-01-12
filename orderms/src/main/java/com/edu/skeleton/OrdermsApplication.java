package com.edu.skeleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrdermsApplication {
	
	@GetMapping
	public String getHello() {
		return "Peace";
	}

	public static void main(String[] args) {
		SpringApplication.run(OrdermsApplication.class, args);
	}

}
