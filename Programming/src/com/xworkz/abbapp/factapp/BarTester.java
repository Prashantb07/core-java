package com.xworkz.abbapp.factapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BarTester {
	
	
	public static void main(String[] args) {
	

		
     	Bar bar = new Bar(1,"GD bar","Rajajinagar","Raju");
     	
     	Stall stall = new Stall();
     	
     	System.out.println(bar.hashCode());
		System.out.println(bar);  // implicit calling of toString()
		System.out.println(bar.toString());   //explicit calling of toString()
		
		Bar bar1 = new Bar(2,"MANJU bar","Rajajinagar","Vithal");
		
		System.out.println(bar1.hashCode());
		
		System.out.println(bar1.toString());
		
		System.out.println(bar.equals(bar1)); // false
		
	
		System.out.println(bar == bar1); // false
	
		System.out.println(bar.equals(stall));
	}
	

}


