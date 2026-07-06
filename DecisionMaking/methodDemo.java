
public class methodDemo {
	
	    // 1. Static Method (Executes directly via Class context)
	    public static int multiply(int a, int b) {
	        return a * b; // Returns calculated integer data
	    }
	    // 2. Instance Method (Requires concrete object instantiation)
	    public void displayGreeting(String name) {
	        System.out.println("Welcome to Java development, " + name + "!");
	   }
	    public static void main(String[] args) {
	        // Invoking a Static Method directly
	        int product = methodDemo.multiply(5, 4);
	        System.out.println("Product result: " + product);

	        // Invoking an Instance Method via Object Creation
	        methodDemo demoObject = new methodDemo();
	        demoObject.displayGreeting("Alex");
	        
	        // Invoking a Predefined Method from Java Class Libraries
	        double squareRoot = Math.sqrt(64);
	        System.out.println("Square root of 64: " + squareRoot);
	    }

}
