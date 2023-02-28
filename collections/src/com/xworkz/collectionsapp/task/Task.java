package com.xworkz.collectionsapp.task;

import java.util.ArrayList;
import java.util.Collection;

public class Task {
	
	public static void main(String[] args) {
		
		Collection list = new ArrayList();
		
		list.add(0);
		list.add("Vithal");
		list.add(7338059822l);
		
		list.add(1);
		list.add("Abhi");
		list.add(8088565885l);
		
		list.add(2);
		list.add("Omkar");
		list.add(7026495978l);
		
		list.add(3);
		list.add("Shiva");
		list.add(9341022626l);
		
		list.add(4);
		list.add("Vijay");
		list.add(7259829359l);
		
		list.add(5);
		list.add("Satish");
		list.add(9359472656l);
		
		list.add(6);
		list.add("Raju");
		list.add(9945516067l);
		
		list.add(7);
		list.add("Darshan");
		list.add(9740019097l);
		
		list.add(8);
		list.add("Punith");
		list.add(9036240718l);
		
		list.add(9);
		list.add("Chida");
		list.add(7795390544l);
		
		list.add(10);
		list.add("Teju");
		list.add(7899024307l);
		
		
		Collection list1 = new ArrayList();
		
		list1.add(11);
		list1.add("Vithal1");
		list1.add(7338059822l);
		
				
		System.out.println(list.contains("likith"));
		System.out.println("the size of the collection before using remove is "+list.size());
		System.out.println(list);
		System.out.println(list.remove("Raju"));
		System.out.println("The size of the collection after using remove is "+list.size());
		System.out.println(list.equals(list1));
		System.out.println(list.isEmpty());
		System.out.println(list.addAll(list));
		System.out.println(list.containsAll(list));
		System.out.println(list.removeAll(list));
//		System.out.println(list.retainAll(list));
		
		
		
		
		
	}

}
