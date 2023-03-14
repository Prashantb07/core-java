package com.xworkz.javafeatures.functionalprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tester {
	public static void main(String[] args) {
		
//		 ( -> )this is symbol of lambda experssion
//		return type of any lambda experssion is FunctionInterface
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Add two numbers");
		Addition addition = (num1 , num2) -> { 
			System.out.println("start of add method");
			System.out.println(num1+num2);
			System.out.println("end of add method");
		};
		
		addition.add("789",78);
		
		
		System.out.println("Sub two numbers");
		Substraction substraction = (a,b) -> {
			System.out.println("Start of Substraction method");
			System.out.println(a-b);
			System.out.println("end of substraction method");
		};
		substraction.sub(45, 50);
		
		
		System.out.println("Multiplication of two numbers");
		Multiplication multiplication = (c,d) -> {
			System.out.println("start of multiplication method");
			System.out.println(c * d);
			System.out.println("end of multiplication method");
		};
		multiplication.multiple(12, 9);
		
		
		System.out.println("Dividion of two numbers");
		Division division = (e,f) -> {
			System.out.println("start of division method");
			System.out.println(e / f);
			System.out.println("end of division method");
		};
		division.division(64, 8);
		
		System.out.println("Modulus of two numbers");
		Modulus modulus = (g,h) -> {
			System.out.println("start of modulus method");
			System.out.println( g % h);
			System.out.println("end of modulus method");

		};
		modulus.modulus(25, 3);
	}

}


/* 
 	Lambda expression
	bufferreader 
*/