package guru.springframework.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import guru.springframework.di.services.GreetingService;

@Controller
public class MyController {

	@Autowired
	private GreetingService greetingService;
	
	public String sayHello() {
		
		System.out.println("SFG DI");
		return "That's here";
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
