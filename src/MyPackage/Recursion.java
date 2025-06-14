package MyPackage;

public class Recursion {
	public int fac(int n) {
		if(n==1)	return 1;
		else {
			return n * fac(n-1);
		}
		
	}
	public static void main(String args[]) {
		Recursion r1 = new Recursion();
		System.out.println("Factorial of 5: " + r1.fac(5));
	}
}
