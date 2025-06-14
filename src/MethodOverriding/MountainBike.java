package MethodOverriding;

public class MountainBike extends Bicycle {
	int height;
	
	public MountainBike(int s, int g, int h) {
		super(s, g);
		this.height = h;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void speedUp(int s) {
		this.speed += (s+10);
	}
	public void speedDown(int s) {
		this.speed -= (s+10);
	}
}
