package MyPackage;

public class Operators {
	public static void main(String args[]) {
		// Arithmetic Operators
		int a = 2, b=4;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(b/a);
		System.out.println(b%a);
		
		// Unary Operators
		int p = -10;
		int q = 9;
		boolean f = false;
		
		System.out.println(-p);
		System.out.println(+q);
		System.out.println(q++);
		System.out.println(q);
		System.out.println(q--);
		System.out.println(q);
		System.out.println(++q);
		System.out.println(--q);
		System.out.println(!f);
		
		// Comparison Operator
		int m = 3, n = 4;
		System.out.println(m == n);
		System.out.println(m != n);
		System.out.println(m < n);
		System.out.println(m <= n);
		System.out.println(m > n);
		System.out.println(m >= n);
		
		//Conditional Operators
		if(false || true) {
			System.out.println("OR operation");
		}
		if(true && true) {
			System.out.println("AND operation");
		}
		

	}
}
