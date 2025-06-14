package Collections;

import java.util.TreeSet;

public class TreeSets {
	public static void main(String args[]) {
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		tset.add(1);
		tset.add(3);
		tset.add(4);
		tset.add(2);
		tset.add(1);
		tset.add(3);
		
		System.out.println(tset);
	}
}
