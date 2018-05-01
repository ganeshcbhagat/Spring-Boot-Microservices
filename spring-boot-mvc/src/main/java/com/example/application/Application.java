package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.application.configuration.ApplicationConfiguration;

@SpringBootApplication
@ImportAutoConfiguration (classes=ApplicationConfiguration.class)
public class Application {
	
	//http://localhost:8080/api/login
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
