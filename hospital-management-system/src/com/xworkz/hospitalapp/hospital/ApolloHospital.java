package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospital extends Hospital {
	
	boolean isFormedFilled = true;

	public ApolloHospital(int size) {
		//patient = new Patient[size];
		super(size);
		System.out.println("ApolloHospital object is created ");
		
		
	}
	
	@Override
	public Patient saveDetails(Patient patient) {
		System.out.println("hello");
		if(isFormedFilled == true) {
			return super.saveDetails(patient);
		}
		return patient;
	}

	
	public String canteen() {
		System.out.println("Delicious food");
		return " food";
	}
}


// super method is used to parent class constructor
//super keyword is used to called parent and child constructor
//super is used comminication b/w child class to parent class
//super(); default constructor the we can use array inisilization super.customer=new Constructor[size];
//if super(size); the no need to do array inisilization.