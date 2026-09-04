package PrimaryQualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engine engine;
	
	
	//Constructor Injection
	
	public Car(Engine engine) {
		 super(); 
		 this.engine = engine;
	}
	
	
	public void drive() {
		engine.run();
		System.out.println("car is running");
	}

}
