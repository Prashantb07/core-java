package com.xworkz.abbapp.juiceshop;



public abstract class Juiceshop implements Shop {
	int rental = 90000;
	
	//abstract methods - does not contain body

	@Override
	public long doBussiness() {
		System.out.println(rental);
		return 7000;
		
	
		
	}
}
