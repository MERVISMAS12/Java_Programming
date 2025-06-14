package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
	public static void main(String args[]) {
		List<Integer> arrlist = new ArrayList<Integer>(5);
		for(int i=0; i<5; i++) {
			arrlist.add(i);
		}
		System.out.println(arrlist);
		arrlist.remove(0);
		System.out.println(arrlist);
		for(int i=0; i<arrlist.size(); i++) {
			System.out.println(arrlist.get(i)+" ");
		}
	}
}
