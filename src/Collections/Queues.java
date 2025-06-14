package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
	public static void main(String args[]) {
		Queue<String> q = new PriorityQueue<String>();
		q.add("f");
		q.add("d");
		q.add("b");
		q.add("e");
		q.add("c");
		q.add("a");
		
		System.out.println(q); // does not reflect natural ordering
		
		q.remove();
		System.out.println(q); 
		
		String head = q.poll();
		System.out.println("Head: "+ head); 
		
		System.out.println("Peek element: "+q.peek()); 
		System.out.println(q);



	}
}
