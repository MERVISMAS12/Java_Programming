package ExceptionHandling;

public class RuntimeExceptions {
	public static void main(String args[]) throws ArithmeticException {
//		System.out.println("Answer: " + 100/0);
//		String a = null;
//		
//		System.out.println("Char: " + a.charAt(0));
		
		try {
			System.out.println("Answer: " + 100/0);
		}catch(ArithmeticException AE){
			System.out.println("Cannot divide by zero");
			System.out.println(AE.getMessage());

		}finally {
			System.out.println("End of Program.");
		}

	}
}
