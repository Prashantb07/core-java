package com.xworkz.abbapp.watch;



public class WatchTester {

	static int rental=741;
	public static void main(String[] args) {
		
		TitanWatch fj = new TitanWatch();
		System.out.println(rental);
		
		fj.doBussiness();
		System.out.println(fj.freewatch());
		fj.freewatch1();
	}

}
