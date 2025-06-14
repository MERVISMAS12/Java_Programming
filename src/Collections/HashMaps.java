package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMaps {
	public static void main(String args[]) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("a", 101);
		hmap.put("b", 102);
		hmap.put("c", 103);
		
		System.out.println(hmap);
		
		if(hmap.containsKey("a")){
			System.out.println("Key a has value: "+ hmap.get("a"));
		}
		
		for(String k : hmap.keySet()) {
			System.out.println("Key "+ k + " Value "+ hmap.get(k));
		}
		
		for(Entry<String, Integer> entry : hmap.entrySet()) {
			System.out.println("Key "+ entry.getKey() + " Value "+ entry.getValue());
		}
	}
}
