package InterfaceDemo;

public class MountainBike implements Bicycle {
	int speed;
	int gear;
	int heigth;
	
	public MountainBike(int speed, int gear, int heigth) {
		this.speed = speed;
		this.gear = gear;
		this.heigth = heigth;
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
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	@Override
	public void speedUp(int s) {
		this.speed = this.speed+s;
		
	}

	@Override
	public void brake(int d) {
		this.speed = this.speed - d;		
	}

}
