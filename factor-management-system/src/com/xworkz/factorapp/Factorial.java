package com.xworkz.factorapp;

public class Factorial {

	public int findFact(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			
			fact = fact * i;
		}
		return fact;
	}
	
	

}
