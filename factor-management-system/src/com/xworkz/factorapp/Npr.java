package com.xworkz.factorapp;

public class Npr {
	
	/* npr = n!/(n-r)!  */
	
	public int nprFact (int n,int r) {
	
		int total,numerator,denominator;
		
		numerator = n;
		for(int i=n-1;i>=1;i--) {
			numerator = numerator * i;
			
		}
		
		System.out.println("numerator = " + numerator);
		
		int a;
		a = n-r;
		denominator=a;
		
		for(int j=a-1; j>=1; j--) {
			denominator = denominator*j;
			
		}
		
		System.out.println("denominator =" + denominator);
		total = numerator / denominator;
		System.out.println("npr of " + n + " and " + r + " is " + total);
		
		return total;
		
	}

}
