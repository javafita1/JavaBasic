package Constructor;

public class Student {
	
	private String name;
	private int age;
	
	public Student() {  //no return type not even void for constructor
		super();
		this.name = "John";
		this.age = 12;
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	public void display() {
		System.out.println("Student [name=" + name + ", age=" + age + "]");
	}
	
	

}
