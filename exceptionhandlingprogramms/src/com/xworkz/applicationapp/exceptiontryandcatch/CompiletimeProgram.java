package com.xworkz.applicationapp.exceptiontryandcatch;

import java.io.File;
import java.io.IOException;

public class CompiletimeProgram {
	
	public static void main(String[] args) {
		System.out.println("main method ended");
		try {
			Class cls = Class.forName("com.xworkz.applicationapp.exceptiontryandcatch.CompiletimeProgram");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File file = new File("myfile.txt");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main method ended");
	}

}
