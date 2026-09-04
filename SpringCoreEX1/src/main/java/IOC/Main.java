package IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	
	public static void main(String[] args) {
		
		//Without IOC
		//Car car=new Car();
		//car.drive();
		
		//With IOC
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car= context.getBean(Car.class);
		car.drive();
		
		
		
	}

}
