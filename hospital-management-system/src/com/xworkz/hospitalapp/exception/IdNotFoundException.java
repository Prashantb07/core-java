package com.xworkz.hospitalapp.exception;

public class IdNotFoundException extends Exception{

	
	@Override
	public String toString() {
				return "Patient not found by given Id";
	}
}
