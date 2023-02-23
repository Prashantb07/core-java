package com.xworkz.applicationapp.errors;

import java.io.File;
import java.io.IOException;

public class Errors {
	
	public static void main(String[] args) {
	
		System.out.println("main method started");
	 try {
		m1();
		
	} catch (ClassNotFoundException | IOException | NullPointerException | StringIndexOutOfBoundsException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	 
	 System.out.println("main method ended");
	}

	private static void m1() throws ClassNotFoundException , IOException , NullPointerException , StringIndexOutOfBoundsException {
		//m1 specified the exception main
		System.out.println("m1 method started");
		m2();
		System.out.println("m1 method ended");
	}

	private static void m2() throws ClassNotFoundException , IOException , NullPointerException , StringIndexOutOfBoundsException {
		//m2 specified the exception m1
		
		System.out.println("m2 method started");
		m3();
		System.out.println("m2 method ended");
	}

	private static void m3() throws ClassNotFoundException , IOException , NullPointerException , StringIndexOutOfBoundsException {
		//m3 specified the exception m1
		System.out.println("m3 method started");
		Class cls = Class.forName("com.xworkz.applicationapp.errors.Errors");
		
		File file = new File("newfile.text");
		
		file.createNewFile();
		
		String str = "prashant";
		System.out.println(str.charAt(8));
		
		System.out.println("m3 method ended");
	}

}
