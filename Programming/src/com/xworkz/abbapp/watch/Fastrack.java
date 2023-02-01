package com.xworkz.abbapp.watch;

public class Fastrack implements Watch {
int rental = 1900;
	
	//abstract methods - does not contain body

	public long doBussiness() {
		System.out.println(rental);
		return 5000;
		
	
		
	}

	public long freewatch() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long freewatch1() {
		// TODO Auto-generated method stub
		return 0;
	}

}
