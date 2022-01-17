package com.edu.kafkaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafkaClient2Application {

	@KafkaListener(topics = "javatechie", groupId = "a")
	public void consume(String message) {
		System.out.println("message: " + message);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaClient2Application.class, args);
	}

}
