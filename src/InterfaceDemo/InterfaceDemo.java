package InterfaceDemo;

public class InterfaceDemo {
	public static void main(String args[]) {
		MountainBike b1 = new MountainBike(10, 1, 10);
		
		System.out.println("Speed of bike: " + b1.getSpeed());
		System.out.println("Gear of bike: " + b1.getGear());
		System.out.println("Heigth of bike: " + b1.getHeigth());
		
		b1.speedUp(2);
		System.out.println("Incerease speed of bike: " + b1.getSpeed());
		
		b1.brake(5);
		System.out.println("Decrease speed of bike: " + b1.getSpeed());
		
	}
}
