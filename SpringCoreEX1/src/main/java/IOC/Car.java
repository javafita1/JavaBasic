package IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	//Engine engine=new Engine();
	
	@Autowired
	Engine engine;
	
	
	
	public void drive() {
		engine.run();
		System.out.println("car is running");
	}


}