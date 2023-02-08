package com.xworkz.taskapp;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionTask {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			
			System.out.println("enter new file name");
			
			File fi = new File(sc.next());
			
			try {
				fi.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		sc.close();

}
}