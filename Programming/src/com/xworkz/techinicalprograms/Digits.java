package com.xworkz.techinicalprograms;

public class Digits extends Object {

	public static void main(String[] args) {
		
		int num=1234;
		int count=0;
		while(num>=1) {
			num=num/10;
			
			System.out.println(num);
			count++;
			
		}
		System.out.println("The count of the number is:" +count);
	}
}
