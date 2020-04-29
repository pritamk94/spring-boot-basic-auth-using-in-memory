package com.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class SpringBootBasicAuthUsingInMemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicAuthUsingInMemoryApplication.class, args);
	}
	@GetMapping("/")
	public String rootPage(Principal principal){
		return "Hi " + principal.getName() + " , Welcome to Spring boot world!!";
	}

}
