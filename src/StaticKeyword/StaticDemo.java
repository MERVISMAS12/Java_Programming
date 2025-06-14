package StaticKeyword;

public class StaticDemo {
	public static void main(String args[]) {
		Student s1 = new Student("Mervis", "B", 20);
		
		System.out.println("Student name: " + s1.getName());
		System.out.println("Student age: " + s1.getAge() );
		System.out.println("Student grade: " + s1.getGrade());
		System.out.println("Student college: " + Student.college );
		
		Student s2 = new Student("Nilesh", "A+", 21);
		
		System.out.println("Student name: " + s2.getName());
		System.out.println("Student age: " + s2.getAge() );
		System.out.println("Student grade: " + s2.getGrade());
		System.out.println("Student college: " + Student.college );
		
		Student s3 = new Student("Benin", "A++", 22);
		
		System.out.println("Student name: " + s3.getName());
		System.out.println("Student age: " + s3.getAge() );
		System.out.println("Student grade: " + s3.getGrade());
		System.out.println("Student college: " + Student.college );
		
		Student s4 = new Student("Anujeet", "A", 21);
		
		System.out.println("Student name: " + s4.getName());
		System.out.println("Student age: " + s4.getAge() );
		System.out.println("Student grade: " + s4.getGrade());
		System.out.println("Student college: " + Student.college );
		
		
		System.out.println("Total count of students: " + Student.count );

		
	}
}
