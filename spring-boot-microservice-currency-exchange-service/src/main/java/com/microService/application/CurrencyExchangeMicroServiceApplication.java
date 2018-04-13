package com.microService.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.microService")
@EnableFeignClients("com.microService.proxy")
@EnableDiscoveryClient
public class CurrencyExchangeMicroServiceApplication {

	// Run on browser as http://localhost:8100/currency-converter/from/USD/to/INR/quantity/1000
	// Run on browser as http://localhost:8100/currency-converter-feign/from/USD/to/INR/quantity/1000
	
	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeMicroServiceApplication.class, args);
	}
	
}
