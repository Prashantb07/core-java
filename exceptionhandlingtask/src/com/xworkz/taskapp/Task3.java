package com.xworkz.taskapp;

import java.io.File;
import java.io.IOException;

public class Task3 {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		try {
			Class cls = Class.forName("java.io.IOException");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file = new File(".java");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main method ended");
	}

}
