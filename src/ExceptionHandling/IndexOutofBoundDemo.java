package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class IndexOutofBoundDemo {
	public static void main(String args[]) {
		try {
			List<Integer> l1 = new ArrayList<>();
			l1.add(10);
			
			System.out.println(l1.get(1));
		}catch(IndexOutOfBoundsException IOB) {
			System.out.println("Index out of bound...");
			System.out.println(IOB.getMessage());
			
		}finally{
			System.out.println("Finally code block");
		}
	}
}
