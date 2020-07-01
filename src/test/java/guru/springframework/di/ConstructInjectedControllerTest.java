package guru.springframework.di;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import guru.springframework.di.controllers.ConstructInjectedController;
import guru.springframework.di.services.GreetingServiceImpl;

class ConstructInjectedControllerTest {

	ConstructInjectedController controller;
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructInjectedController(new GreetingServiceImpl());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
