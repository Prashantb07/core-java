package com.xworkz.factorapp;

import java.util.Scanner;

public class NprTester {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the values for n and r");
		
		int n= scan.nextInt();
		int r = scan.nextInt();
		
		Npr n1 =new Npr();
		n1.nprFact(n, r);
		
		scan.close();
	}
}
