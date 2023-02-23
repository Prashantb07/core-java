package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.hospital.ApolloHospital;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitalTester {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		// UP Casting it is also called as //Polymirphism 
		Hospital h1 = new ApolloHospital(size);
		
		// DOWN Casting
		ApolloHospital apolloHospital = (ApolloHospital) h1;
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
			System.out.println("enter the email");
			String email=sc.next();
			
	Patient	patient = new Patient(name,id,bloodGroup,contactNo,email);
	h1.saveDetails(patient);
	
		}
		
//		System.out.println("Enter 1 to fetch all the patients");
//		System.out.println("Enter 2 to fetch  patient by id");
//		
//		int option = sc.nextInt();
//		switch(option) {
//		
//		case 1: h1.getDetails();
//		break;
//		}
//		
//		case 2: System.out.println("enter the ");
//		int  Id = sc.nextInt();
//		h1.getpatientByid(Id);
//		break;
	}

}
