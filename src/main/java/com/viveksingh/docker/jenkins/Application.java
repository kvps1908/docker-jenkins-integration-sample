package com.viveksingh.docker.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/test")
	public String runImage(){
		return "Docker Image Created and Running";
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(Application.class, args);
	}

}
