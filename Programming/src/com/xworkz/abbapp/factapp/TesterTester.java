package com.xworkz.abbapp.factapp;

public class TesterTester {
	
	public TesterTester() {
		//this();  //compile time error
		System.out.println(this.getClass().getSimpleName()+"Object is Created");
		TesterTester testerTester = new TesterTester(); //runtime error
		System.out.println(testerTester);
	}

	public static void main(String[] args) {
		
	
	
		System.out.println("main method started");
		TesterTester testerTester =new TesterTester(); //stack over flow error
		System.out.println(testerTester);
		System.out.println("main method ended");
	}
}
