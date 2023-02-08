package com.xworkz.factorapp;

import java.util.Scanner;

public class FactorialTester {
	
	public static void main(String args[]) {
		
		Factorial factorial = new Factorial();
		
		/* 
		 System.out.println(factorial); 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number to find the factorial fot the same");
		int num = sc.nextInt();
		int fact = factorial.findFact(num);
		System.out.println(" Factorial of " +num+ " is "+fact);
	
	}
}
