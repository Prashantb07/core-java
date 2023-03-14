package com.xworkz.javafeatures.functionalprogramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		list.add(24);
		list.add(67);
		list.add(48);
		list.add(89);
		list.add(65);
		list.add(78);
		list.add(99);
		list.add(55);
		
		
		
		
		//stream
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer integerValues = itr.next();
			if(integerValues % 2 == 0)
				System.out.println(integerValues);
		}
		
		List<Integer> listOfOddNumbers = list.stream().filter(integerValues -> (integerValues % 2 != 0)).collect(Collectors.toList());
		System.out.println("odd numbers in List" + listOfOddNumbers);
		
		System.out.println("List of data usinf stream are");
		list.stream().forEach(integerValues -> System.out.println(integerValues));
	}
}
