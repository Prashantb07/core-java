package com.xworkz.applicationapp.exceptiontryandcatch;

public class Exceptiontryandcatch {
	
	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		divide(1, 0);
		
		System.out.println("Maon method Ended");
	}

	private static void divide(int i, int j) {
	System.out.println("Divide method Started");

		try {
			System.out.println(i/j);
			
		} catch(ArithmeticException e) {
			System.out.println("Cannot Divide given number By Zero");
		}
		System.out.println("Divide method Ended");
	}

}
