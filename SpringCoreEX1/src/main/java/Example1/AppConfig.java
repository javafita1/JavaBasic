package Example1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Engine engine() {
		return new PetrolEngine();
	}
	
	@Bean
	public Car car() {
		return new Car(engine());
	}

}
