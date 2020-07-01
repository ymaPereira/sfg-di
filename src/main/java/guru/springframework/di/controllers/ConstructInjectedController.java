package guru.springframework.di.controllers;

import guru.springframework.di.services.GreetingService;

public class ConstructInjectedController {

	private final GreetingService greetingService;
	
	public ConstructInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}


	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
