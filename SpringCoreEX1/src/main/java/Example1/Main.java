package Example1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car= context.getBean(Car.class);
		
		car.drive();
		
		Engine engine=context.getBean(PetrolEngine.class);
		
		System.out.println(engine==car.getEngine());
		//Comment and uncomment @configuration annotation in AppConfig to see the difference in output.
		
	} 

}


/*
 * Beans are created using component scan, so everytime when the dependent
 * object is called(Car car=new Car(engine());) if engine object already exsist
 * in spring container it will use that, else it will create a new object.
 * Refer Example folder, which is using @ComponentScan--comment and uncomment @configuration annotation in AppConfig there is no change  in output.
 * becoz there objects are created by spring container using @componentScan
 * 
 */

