package guru.springframework.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World";
	}

}
