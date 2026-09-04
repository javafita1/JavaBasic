import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car= context.getBean(Car.class);
		
		car.drive();
		
		//Engine engine=context.getBean(petrolEngine.class);
		
		//System.out.println(engine==car.getEngine());
		
	} 

}

/*
 * However, using the default package is strongly discouraged in Spring.
 * Spring's component scanning is designed to work with named packages, and
 * using the default package can lead to unexpected behavior. In many cases,
 * Spring may even scan the entire classpath, which is inefficient.
 * Refer, Example folder for output(Becoz all the class files are inside a Example package instead of default package)
 */