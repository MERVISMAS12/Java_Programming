package Comparables;


public class Student implements Comparable<Student> {
	String name;
	int rollno;
	int age;
	
	public Student(String name,int rollno, int age) {
		this.name= name;
		this.rollno = rollno;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		
		return this.rollno - o.rollno;
	}

}
