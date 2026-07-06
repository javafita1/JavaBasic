
public class Student {
	
	private int age;
	private String Name;
	private int marks;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Student(int age, String name, int marks) {
		super();
		this.age = age;
		Name = name;
		this.marks = marks;
	}
	
	
	

}
