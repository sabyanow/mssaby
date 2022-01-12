package com.edu.skeleton;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.edu.skeleton.model.User;
import com.edu.skeleton.repository.UserRepository;

@SpringBootApplication
@RestController
public class SkeletonApplication {
	
	private UserRepository userRepository;
	
	public SkeletonApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@GetMapping("/hello")
	public String getHello() {
		return "Hello Edureka!";
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable Long id) {
		Optional<User> user = userRepository.findById(id);
		if (user.isPresent()) return user.get(); 
		return null;
	}
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(SkeletonApplication.class, args);
	}

}
