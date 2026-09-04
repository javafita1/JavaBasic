package Example1;
import org.springframework.stereotype.Component;

public class PetrolEngine implements Engine{

	@Override
	public void run() {
		System.out.println("Runs in Petrol");
		
	}
}
