package PrimaryQualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	
public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car= context.getBean(Car.class);
		
		car.drive();
		
		Bike bike= context.getBean(Bike.class);
		
		bike.drive();
		
		Truck truck= context.getBean(Truck.class);
		
		truck.drive();
		
		
	} 

}




