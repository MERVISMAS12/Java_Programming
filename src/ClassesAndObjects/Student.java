package ClassesAndObjects;

public class Student {
	String name;
	int age;
	String grade;
	
	public Student(String name, int age, String grade){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getGrade() {
		return this.grade;
	}
	
	public void details() {
		System.out.println("Name: "+ this.name + " Age: " + this.age + " Grade: " + this.grade);
	}
	
	public static void main(String args[]) {
		Student s1 = new Student("Mervis", 21, "Mapusa Goa");
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getGrade());
		s1.details();
	}
	
}
