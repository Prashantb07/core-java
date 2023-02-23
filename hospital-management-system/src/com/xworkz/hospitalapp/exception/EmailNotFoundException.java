package com.xworkz.hospitalapp.exception;

//custom unchecked exception
public class EmailNotFoundException extends Exception {
	
 @Override
public String toString() {
	// TODO Auto-generated method stub
	return "Email not found by given Email";
}
}
