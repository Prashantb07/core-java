package com.xworkz.taskapp;

import java.io.File;
import java.io.IOException;

public class Task10 {
	
	public static void main(String[] args) {
		
		System.out.println("main method ended");
		
		try {
			Class cls = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file = new File(".HTM");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main method ended");
	}

}
