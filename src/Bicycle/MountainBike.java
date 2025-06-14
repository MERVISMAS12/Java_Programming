package Bicycle;

public class MountainBike extends Cycle {
	public int seatHeigth;
	
	public MountainBike(int s, int g, int h) {
		super(s, g);
		this.seatHeigth = h;
	}
	public void setSeatHeigth(int h) {
		this.seatHeigth = h;
	}
	public int getSeatHeigth() {
		return this.seatHeigth;
	}
	
}
