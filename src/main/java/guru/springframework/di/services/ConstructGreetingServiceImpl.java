package guru.springframework.di.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructGreetingServiceImpl implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello World - Construct";
	}

}
