package Streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMaps {
	public static void main(String args[]) {
		List<Integer> arr= new ArrayList<Integer>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		arr.add(400);
		
		List<Integer> sqrarr= new ArrayList<Integer>();
		for(int i:arr) {
			sqrarr.add(i*i);
		}
		System.out.println(sqrarr);
		
		List<Integer> sqrarr1 = arr.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(sqrarr1);
		
		Set<Integer> hset = new HashSet<Integer>();
		for(int i:arr) {
			hset.add(i*i);
		}
		System.out.println(hset);
		
		Set<Integer> hset1 = arr.stream().map(x -> x*x).collect(Collectors.toSet());
		System.out.println(hset1);

		
	}
}
