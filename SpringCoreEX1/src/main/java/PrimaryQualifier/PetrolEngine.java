package PrimaryQualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class PetrolEngine implements Engine{

	@Override
	public void run() {
		System.out.println("Runs in Petrol");
		
	}

	
}
