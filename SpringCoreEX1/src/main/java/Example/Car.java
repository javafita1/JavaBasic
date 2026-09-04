package Example;
import org.springframework.stereotype.Component;



@Component
public class Car {
	private Engine engine;
	
	public Car(Engine engine) {
		 super(); 
		 this.engine = engine;
	}
	
	
	 
	public Engine getEngine() {
		return engine;
	}



	public void drive() {
		engine.run();
		System.out.println("car is running");
	}

}
