package Collections;

import java.util.LinkedList;

public class LinkedLists {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.addFirst("z");
		list.addLast("C");
		list.add(0, "y");
		
		System.out.println(list);
		
		list.remove("z");
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);

		list.removeLast();
		System.out.println(list);

	}
}
