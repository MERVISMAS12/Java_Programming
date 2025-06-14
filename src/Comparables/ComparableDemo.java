package Comparables;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	public static void main(String args[]) {
		Student s1 = new Student("Mervis", 101, 21);
		Student s2 = new Student("Nilesh", 102, 22);
		Student s3 = new Student("Anujeet", 103, 22);
		Student s4 = new Student("Benin", 104, 23);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s3);
		list.add(s4);
		list.add(s1);
		list.add(s2);
		System.out.print("\nList: ");
		list.forEach(s -> System.out.print(s.name+" "));
		
		Collections.sort(list);
		System.out.print("\nRoll number sorted List: ");
		list.forEach(s -> System.out.print(s.name+" "));
		
		Collections.sort(list, new AgeComparator());
		System.out.print("\nAge sorted List: ");
		list.forEach(s -> System.out.print(s.name+" "));
	}
}
