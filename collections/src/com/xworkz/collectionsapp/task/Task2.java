package com.xworkz.collectionsapp.task;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("manoj");
		list.add("malik");
		list.add("yuvi");
		list.add("farzi");
		list.add("scam");
		list.add(45);
		list.add(null);
		list.add(null);
		list.add(null);
		
		
		List list1 = new ArrayList();
		
		list1.add("series");
		list1.add("flims");
		list1.add("match");
		list1.add(18);
		
		//System.out.println(list1);
		//System.out.println(list);
	
		System.out.println(list.add(list1));
		System.out.println(list.contains(list1));
		System.out.println(list.size());
		System.out.println(list.addAll(list1));
		System.out.println(list.containsAll(list1));
		System.out.println(list.removeAll(list1));
	}

}
