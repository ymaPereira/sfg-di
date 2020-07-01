package guru.springframework.di;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import guru.springframework.di.controllers.PropertyInjectedController;
import guru.springframework.di.services.GreetingServiceImpl;

class PropertyInjectedControllerTest{

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingServiceImpl();
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
