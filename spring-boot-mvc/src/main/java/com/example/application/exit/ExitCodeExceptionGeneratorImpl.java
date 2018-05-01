package com.example.application.exit;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

@Component
public class ExitCodeExceptionGeneratorImpl extends RuntimeException implements ExitCodeGenerator {

	private static final long serialVersionUID = -5555971849477219713L;

	public ExitCodeExceptionGeneratorImpl() {

	}
	
	public ExitCodeExceptionGeneratorImpl(String message) {
         super(message);
     }
	 
	@Override
	public int getExitCode() {

		return -1;
	}

}
