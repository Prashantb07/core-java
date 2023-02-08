package practiceprogramms;

import java.util.Scanner;

public class Evenorodd {
	
	public static void main(String[] args) {
		int p;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the integer:");
		p = sc.nextInt();
		if(p%2 == 0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}

}
