package ClassWithinClass;

public class CallClassDemo {
	public static void main(String args[]) {
		
		Bicycle.InnerClass c2 = new Bicycle("Mountain Bike 400", "A", 10). new InnerClass();
		c2.display();
		
		Bicycle.StaticNestedClass c1 = new Bicycle.StaticNestedClass();
		c1.display();
		
		Bicycle b1 = new Bicycle("Mountain Bike 400", "A", 10);
		b1.Method();
	}
}
