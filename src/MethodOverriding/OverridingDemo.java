package MethodOverriding;

public class OverridingDemo {
	public static void main(String args[]) {
		System.out.println("Bike b1");
		Bicycle b1 = new Bicycle(20, 1);
		System.out.println("Speed of b1: "+ b1.getSpeed());
		System.out.println("Gear of b1: "+ b1.getGear());
		
		b1.speedUp(1);
		System.out.println("Speed of b1: "+ b1.getSpeed());

		b1.speedDown(2);
		System.out.println("Speed of b1: "+ b1.getSpeed());

		
		System.out.println("\n\nBike b2");
		MountainBike b2 = new MountainBike(20, 1, 20);
		System.out.println("Speed of b2: "+ b2.getSpeed());
		System.out.println("Gear of b2: "+ b2.getGear());
		
		b2.speedUp(1);
		System.out.println("Speed of b2: "+ b2.getSpeed());

		b2.speedDown(2);
		System.out.println("Speed of b2: "+ b2.getSpeed());

	}
}
