package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class SampleProjectApplication {
	@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
	}

}