package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	public static void main(String args[]) {
		List<String> lst = new ArrayList<>();
		lst.add("Python");
		lst.add("C++");
		lst.add("C");
		lst.add("C#");
		lst.add("Java");
		
		for(String i: lst) {
			if(i.startsWith("C")) {
				System.out.println(i);
			}
		}
		
		List<String> res = lst.stream().filter(s->s.startsWith("C")).collect(Collectors.toList());
		System.out.println(res);
		
		List<String> sortres = lst.stream().sorted().collect(Collectors.toList());
		System.out.println(sortres);
		
		lst.stream().forEach(y -> System.out.print(y + " | "));
		
		
	}
}
