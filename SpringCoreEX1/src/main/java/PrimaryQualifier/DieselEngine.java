package PrimaryQualifier;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine{

	@Override
	public void run() {
		System.out.println("Runs in Diesel");
		
	}

}
