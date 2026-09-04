package PrimaryQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	
	
	private Engine engine;
	
	
	//Constructor Injection
	
	public Bike(Engine engine) {
		 super(); 
		 this.engine = engine;
	}

	public void drive() {
		engine.run();
		System.out.println("Bike is running");
	}

}
