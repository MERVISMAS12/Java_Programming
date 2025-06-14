package ClassesAndObjects;

public class Cuboid {
	int h;
	int w;
	int d;
	
	public Cuboid(int h, int w, int d) {
		this.h = h;
		this.w = w;
		this.d = d;
	}
	public Cuboid(int h, int w) {
		this.h = h;
		this.w = w;
		this.d = 10;
	}
	public Cuboid(int dim) {
		this.h = dim;
		this.w = dim;
		this.d = dim;
	}
	public Cuboid() {
		this.h = 10;
		this.w = 10;
		this.d = 10;
	}
	
	public int volume() {
		return this.h*this.w*this.d;
	}
	public static void main(String args[]) {
		int vol;
		Cuboid c1 = new Cuboid(20, 20, 20);
		vol = c1.volume();
		System.out.println("The Volume for standard cuboid: "+ vol);
		
		Cuboid c2 = new Cuboid(20, 20);
		vol = c2.volume();
		System.out.println("The Volume for default standard cuboid: "+ vol);
		
		Cuboid c3 = new Cuboid(20);
		vol = c3.volume();
		System.out.println("The Volume for standard cube: "+ vol); 
		
		Cuboid c4 = new Cuboid();
		vol = c4.volume();
		System.out.println("The Volume for default cuboid: "+ vol);
		
	}
}
