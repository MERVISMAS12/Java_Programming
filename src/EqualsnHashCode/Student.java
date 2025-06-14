package EqualsnHashCode;

public class Student {
	String name;
	String grade;
	int rollno;
	int age;
	
	public Student(String name, String grade, int age, int rollno) {
		this.age = age;
		this.grade = grade;
		this.name = name;
		this.rollno = rollno;
	}
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public boolean equals(Student s) {
		if(this == s) {
			return true;
		}
		if(s == null || s.getClass() != this.getClass()) {
			return false;
		}
		Student r = (Student) s;
		if(r.rollno == this.rollno) {
			return true;
		}else {
			return false;
		}
	}
	
	public int hashcode(Student s) {
		return s.rollno;
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
	
}
