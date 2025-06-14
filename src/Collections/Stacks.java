package Collections;

import java.util.Stack;

public class Stacks {
	public static void main(String args[]) {
		Stack<String> s = new Stack<>();
		
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		s.push("f");
		System.out.println(s);

		String popele = s.pop();
		
		System.out.println("Popped Element : " + popele);
		System.out.println("Top Element : " + s.peek());
		System.out.println(s);

	}
}
