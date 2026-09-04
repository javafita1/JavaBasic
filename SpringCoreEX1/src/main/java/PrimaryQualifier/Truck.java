package PrimaryQualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Truck {
private Engine engine;
	
	
	//Constructor Injection
	
	public Truck(@Qualifier("dieselEngine") Engine engine) {
		 super(); 
		 this.engine = engine;
	}


	public void drive() {
		engine.run();
		System.out.println("Truck is running");
	}

}
