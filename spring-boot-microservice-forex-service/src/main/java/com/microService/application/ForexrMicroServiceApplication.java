package com.microService.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.microService")
@EnableJpaRepositories(basePackages = "com.microService.repository")
@EntityScan(basePackages= "com.microService.entity") 
public class ForexrMicroServiceApplication {

	// Run on browser as http://localhost:8000/currency-exchange/from/USD/to/INR/
	// Run on browser as http://localhost:8001/currency-exchange/from/USD/to/INR/
	
	public static void main(String[] args) {
		SpringApplication.run(ForexrMicroServiceApplication.class, args);
	}
	
}
