package com.xworkz.abbapp.factapp;

public class Tester {
	public static void main(String[] args) {
		
		

     	Bar bar = new Bar
     	
     	Stall stall = new Stall();
     	
     	System.out.println(bar.hashCode());
		System.out.println(bar);  // implicit calling of toString()
		System.out.println(bar.toString());   //explicit calling of toString()
		
		Bar bar1 = new Bar(2,"MANJU bar","Rajajinagar","Vithal");
	}

}
