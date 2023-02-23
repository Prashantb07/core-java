package com.xworkz.showroom.Excepetion;

public class ManagerNotFoundException extends Exception {
	
	String errorMessage;
	
	public ManagerNotFoundException(String errorMessage) {
		super(errorMessage);
	}

	public ManagerNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	

}
