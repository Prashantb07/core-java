package com.dev.devapp;

public class BarTester {
	
	public static void main(String[] args) {
	
		
     	Bar bar = new Bar(1,"GD bar","Rajajinagar","Raju");
      
     	Stall stall = new Stall();
     	
		System.out.println(bar);  // implicit calling of toString()
		System.out.println(bar.toString());   //explicit calling of toString()
		
		Bar bar1 = new Bar(1,"MANJU bar","Rajajinagar","Vithasl");
		System.out.println(bar1.toString());
		
		System.out.println(bar.equals(bar1)); // false
		
	
		System.out.println(bar == bar1); // false
	
		System.out.println(bar.equals(stall));
	}
	

}


