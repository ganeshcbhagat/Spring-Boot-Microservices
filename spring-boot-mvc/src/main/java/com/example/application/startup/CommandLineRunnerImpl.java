package com.example.application.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.application.configuration.CustomConfigurationProperty;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

	@Autowired
	private CustomConfigurationProperty customConfigurationProperty;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application started : "+customConfigurationProperty);
	}

}
