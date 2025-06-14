package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamReduce {
	public static void main(String args[]) {
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(3);
		lst.add(6);
		lst.add(12);
		lst.add(8);
		lst.add(10);
		lst.add(5);
		
		int sum = lst.stream().reduce(0, (s,i) -> s+i);
		System.out.print(sum);
		
	}
}
