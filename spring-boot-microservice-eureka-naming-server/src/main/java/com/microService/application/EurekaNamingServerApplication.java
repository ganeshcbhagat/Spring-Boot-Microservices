package com.microService.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaNamingServerApplication {

	// Run on browser as http://localhost:8761/
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaNamingServerApplication.class, args);
	}
	
}
