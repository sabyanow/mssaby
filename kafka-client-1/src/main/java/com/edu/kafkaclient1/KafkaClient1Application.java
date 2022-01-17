package com.edu.kafkaclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaClient1Application {
	
	@KafkaListener(topics = "javatechie", groupId = "a")
	public void consume(String message) {
		System.out.println("message: " + message);
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaClient1Application.class, args);
	}

}
