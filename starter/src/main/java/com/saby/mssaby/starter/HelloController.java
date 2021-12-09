package com.saby.mssaby.starter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "It's may be 9th dec 2021 2AM .So just starting ms.wish me luck";
	}

}
