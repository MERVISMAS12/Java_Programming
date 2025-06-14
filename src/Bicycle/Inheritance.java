package Bicycle;

public class Inheritance {
	public static void main(String args[]) {
		MountainBike b1 = new MountainBike(10, 1, 20);
		
		System.out.println("Bike b1 details:");
		System.out.println("Speed: "+ b1.getSpeed());
		System.out.println("Gear: "+ b1.getGear());
		System.out.println("Heigth: "+ b1.getSeatHeigth());
	}
}
