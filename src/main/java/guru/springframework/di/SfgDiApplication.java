package guru.springframework.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import guru.springframework.di.controllers.ConstructInjectedController;
import guru.springframework.di.controllers.MyController;
import guru.springframework.di.controllers.PropertyInjectedController;
import guru.springframework.di.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		
		System.out.println(myController.sayHello());
		
		System.out.println("-------------- Default Service --------------");
		System.out.println(myController.getGreeting());
		
		System.out.println("-------------- Property DI --------------");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		
		System.out.println("-------------- Setter DI --------------");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		
		System.out.println("-------------- Construct DI --------------");
		
		ConstructInjectedController constructInjectedController = (ConstructInjectedController) ctx.getBean("constructInjectedController");
		System.out.println(constructInjectedController.getGreeting());
	}

}
