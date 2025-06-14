package ClassWithinClass;

public class Bicycle {
	static String name;
	static private String grade;
	int age;
	
	public Bicycle(String n, String g, int a) {
		this.age = a;
		grade = g;
		name = n;
	}
	
	static class StaticNestedClass{
		
		void display() {
			System.out.println("Cycle name: " + Bicycle.name);
			System.out.println("Cycle grade: " + Bicycle.grade);
		}
		
	}
	
	class InnerClass{
		void display() {
			System.out.println("Inside the Inner Class");
		}
	}
	
	public void Method(){
		class MethodLocalClass{
			void display() {
				System.out.println("Method local class call");
			}
		}
		MethodLocalClass m1 = new MethodLocalClass();
		m1.display();
	}
}
