package DIandTypes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Engine engine() {
		return new PetrolEngine();
	}
	
	@Bean
	public Car car() {
		//Constructor Injection
		
		return new Car(engine());
		
		//setter Injection with manual wiring
		
//		Car car=new Car();
//		car.setEngine(engine());
//		return car;
		
		//setter Injection with Autowiring and Field Injection
		//return new Car();
	}

}
