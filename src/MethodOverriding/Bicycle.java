package MethodOverriding;

public class Bicycle {
	int speed, gear;
	
	public Bicycle(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public void speedUp(int s) {
		this.speed += s;
	}
	public void speedDown(int s) {
		this.speed -= s;
	}
}
