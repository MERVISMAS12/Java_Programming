package MyPackage;
public class DataConversion{
	public static void main(String args[]) {
		
		//Implicit Data Conversion
		
		int a = 100;
		long b = a;
		float c = b;
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		
		//Explicit Data Conversion
		
		double z = 50.50;
		float y = (float)z;
		long x = (long)y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
	}
}