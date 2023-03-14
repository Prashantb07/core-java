package com.xworkz.javafeatures.functionalprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenListTask {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(19);
		list.add(67);
		list.add(23);
		list.add(34);
		list.add(190);
		list.add(165);
		list.add(134);
		list.add(157);
		list.add(59);
		list.add(12);
		list.add(43);
		list.add(90);
		
		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer inte = itr.next();
			if(inte % 2 == 0)
				System.out.println(inte);
		}
		System.out.println("Filtering the data by using filter method");
		
		System.out.println(" ");
		
		System.out.println("The data is less than 100");
		List<Integer> lessThenHundred = list.stream().filter(inte->(inte<100)).collect(Collectors.toList());
		System.out.println(lessThenHundred);
		
		System.out.println(" ");
		
		System.out.println("The data is more than 100");
		List<Integer> moreThenHundred = list.stream().filter(inte->(inte>100)).collect(Collectors.toList());
		System.out.println(moreThenHundred);
		
		System.out.println(" ");
		
		System.out.println("The data is even");
		List<Integer> evenNumber = list.stream().filter(inte->(inte % 2==0)).collect(Collectors.toList());
		System.out.println(evenNumber);
		
		System.out.println(" ");
		
		System.out.println("The data is Odd");
		List<Integer> oddNumber = list.stream().filter(inte->(inte % 2 != 0)).collect(Collectors.toList());
		System.out.println(oddNumber);
	}

}
