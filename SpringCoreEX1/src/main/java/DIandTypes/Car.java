package DIandTypes;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private Engine engine;  //using interface to achieve loose coupling
	
	
	//Constructor Injection
	public Car(Engine engine) {
		super();
		this.engine = engine;
	}
	

	
	
	//SetterInjection
//	@Autowired
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
	

	
	//Field Injection
	
//	@Autowired
//	private Engine engine;
	
	
	public void drive() {
		engine.run();
		System.out.println("car is running");
	}


	


}
