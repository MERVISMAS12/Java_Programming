package Collections;

import java.util.TreeMap;

public class TreeMaps {
	public static void main(String args[]) {
		TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
		tmap.put("C", 103);
		tmap.put("D", 104);
		tmap.put("E", 105);
		tmap.put("F", 106);
		tmap.put("A", 101);
		tmap.put("B", 102);
		
		System.out.print(tmap);

	}
}
