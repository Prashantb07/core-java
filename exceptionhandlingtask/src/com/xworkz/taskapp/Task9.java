package com.xworkz.taskapp;

import java.io.File;
import java.io.IOException;

public class Task9 {
	
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		try {
			Class cls = Class.forName("Task9");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file = new File(".DOC");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main method ended");
	}

}
