package com.xworkz.collectionsapp.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListTester {
	
	public static void main(String[] args) {
		
		
		List list = new ArrayList();
		//ArrayList , Vector , LinkedList , Stack
		
		list.add("Baba");
		list.add("Zebra");
		list.add("Aane");
		list.add("Flights");
		list.add(60);
		list.add(null);
		list.add(null);
		list.add(null);
		//li.clear();
		
		System.out.println(list.indexOf("Baba"));
		System.out.println(list.lastIndexOf(null));
		
		for(Object obj : list) {
			//list.add("body");   
			//list.add(3, "body");       //error is ConcurrentModificationException
			System.out.print(obj + ",");
		}
		
		System.out.println("The size of Collection after using remove is " + list.size());
		
	}

}
