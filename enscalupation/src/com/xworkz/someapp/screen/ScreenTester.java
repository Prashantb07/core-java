package com.xworkz.someapp.screen;

import java.util.Scanner;

public class ScreenTester {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Screen scrr = new Screen();
		System.out.println("enter the screen name");
		scrr.setScreenName(sc.next());
		System.out.println("enter the screen type");
		scrr.setScreenType(sc.next());
		System.out.println("enter the screen size");
		scrr.setSizee(sc.nextInt());
		System.out.println(scrr.getScreenName() + " " + scrr.getScreenType() + " " + scrr.getSizee());
	}
}