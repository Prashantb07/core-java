package com.xworkz.taskapp;

import java.io.File;
import java.io.IOException;

public class Task7 {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		try {
			Class cls = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file = new File(".PPT");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main method ended");
	}

}
