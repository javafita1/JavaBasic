package Constructor;

public class Main {
	
	public static void main(String[] args) {
		
		Student s1=new Student(); //default constructor is getting called when object is created
		
		//Instead of assigning values to variables like
				//s2.setName("Vinay");
				//s2.setAge(14));
		
		//use parameterized constructor to set values
		Student s2= new Student("Vinay",14);
		
		
		
		s1.display();
		s2.display();
	}

}
