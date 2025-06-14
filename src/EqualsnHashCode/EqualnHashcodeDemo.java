package EqualsnHashCode;

public class EqualnHashcodeDemo {
	public static void main(String args[]) {
		Student s1 = new Student("Mervis", "A+", 21, 1);
		Student s2 = new Student("Mervis", "A+", 21, 1);
		Student s3 = new Student("Nilesh", "A+", 21, 2);
		Student s4 = new Student("Nilesh", "A+", 21, 1);

		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.getName());

	}
}
