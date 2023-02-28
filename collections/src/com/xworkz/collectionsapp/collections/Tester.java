package com.xworkz.collectionsapp.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Tester {
	
	public static void main(String[] args) {
		
	
	
	// Collection FrameWork
	// Interface ref = new ImplClass();
	
	
	Collection list = new ArrayList();
	
	list.add("Baba");
	list.add("Zebra");
	list.add("Aane");
	list.add("Flights");
	list.add(60);
	
	Collection list1 = new ArrayList();
	list1.add("Babu");
	list1.add("Zebra");
	list1.add("Aane");
	list1.add("Flights");
	list1.add(60);
	
	
	
	System.out.println(list.contains("Prashant"));
	System.out.println("the size of the collection before using remove is "+list.size());
	System.out.println(list);
	System.out.println(list.remove("Baba"));
	System.out.println("The size of the collection after using remove is "+list.size());
	System.out.println(list.equals(list1));
	System.out.println(list.isEmpty());
	System.out.println(list.addAll(list));
	System.out.println(list.containsAll(list));
	System.out.println(list.removeAll(list));
//	System.out.println(list.retainAll(list));
	
	
	}
}
