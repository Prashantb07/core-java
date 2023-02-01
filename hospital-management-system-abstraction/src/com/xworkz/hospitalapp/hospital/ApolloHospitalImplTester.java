package com.xworkz.hospitalapp.hospital;

import java.util.Scanner;

public class ApolloHospitalImplTester {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		// UP Casting it is also called as //Polymirphism 
		Hospital h1 = new ApolloHospitalImpl(size);
		
		// DOWN Casting
		ApolloHospitalImpl apolloHospital = (ApolloHospitalImpl) h1;
		apolloHospital.canteen();
		
		
		for(int i=0;i<size;i++) {
	
			System.out.println("enter the name");
			String name = sc.next();
			System.out.println("enter the id");
			int id = sc.nextInt();
			System.out.println("enter the bloodGroup");
			String bloodGroup=sc.next();
			System.out.println("enter the contactNo");
			long contactNo=sc.nextLong();
			
	Patient	patient = new Patient(name,id,bloodGroup,contactNo);
	h1.addPatient(patient);
	
		}
		
		System.out.println("Enter 1 to fetch all the patients");
		
		int option = sc.nextInt();
		switch(option) {
		
		case 1: h1.getallPatient();
		break;
		}
	
	}
}
