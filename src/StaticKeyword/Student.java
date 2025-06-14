package StaticKeyword;

public class Student {
	String name;
	String grade;
	int age;
	static String college = "XIE";
	static int count = 0;
	
	public Student(String name, String grade, int age) {
		this.age = age;
		this.grade = grade;
		this.name = name;
		Student.counter();
	}
	
	static void counter() {
		count += 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getCount() {
		return count;
	}

	
}
