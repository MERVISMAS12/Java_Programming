package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
	public static void main(String args[]) {
		Set<String> hset = new HashSet<String>();
		hset.add("A");	
		hset.add("B");		
		hset.add("C");		
		hset.add("C");	
		
		System.out.println(hset);
		
		hset.remove("A");
		
		System.out.println("Does the Set contains A: "+hset.contains("A"));
		
		for(String i : hset) {
			System.out.print(i+" ");
		}
	}
}
