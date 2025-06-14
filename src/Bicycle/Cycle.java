package Bicycle;

public class Cycle {
	protected int speed;
	protected int gear;
	
	public Cycle(int s, int g) {
		this.speed = s;
		this.gear = g;
	}
	
	public void setSpeed(int s) {
		this.speed = s;
	}
	public void setGear(int g) {
		this.speed = g;
	}
	public int getSpeed() {
		return this.speed;
	}
	public int getGear() {
		return this.gear;
	}
}
