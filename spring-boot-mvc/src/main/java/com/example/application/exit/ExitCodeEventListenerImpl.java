package com.example.application.exit;

import org.springframework.boot.ExitCodeEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ExitCodeEventListenerImpl {

	@EventListener
	public void exitEvent(ExitCodeEvent exitCodeEvent) {
		System.out.println("Exit Code: "+exitCodeEvent.getExitCode());
		System.out.println("Source: "+exitCodeEvent.getSource());
	}
	
}
