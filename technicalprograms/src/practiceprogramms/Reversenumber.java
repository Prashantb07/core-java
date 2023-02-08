package practiceprogramms;

import java.util.Scanner;

public class Reversenumber {
	public static void main(String[] args) {
		int p,s;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		p=sc.nextInt();
		
		while (p>0) {
			s=p%10;
			p=p/10;
			b=(b*10)+s;
		}
		System.out.println("reverse is:" +b);
		
	}

}
