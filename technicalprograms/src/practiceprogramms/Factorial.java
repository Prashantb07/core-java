package practiceprogramms;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		int p, fact=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		p = sc.nextInt();
		
		for(int i=1;i<=p;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of " + p + " is " + fact);
	}

}
