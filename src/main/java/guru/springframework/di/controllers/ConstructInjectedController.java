package guru.springframework.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import guru.springframework.di.services.GreetingService;

@Controller
public class ConstructInjectedController {

	private final GreetingService greetingService;
	
	@Autowired
	public ConstructInjectedController(@Qualifier("constructGreetingServiceImpl") GreetingService greetingService) {
		this.greetingService = greetingService;
	}


	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
