package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.exception.IdNotFoundException;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {

	public static void main(String[] args) throws IdNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		Hospital h1=new Hospital(size);
		for(int i=0;i<size;i++) {
			
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the id");
			int id=sc.nextInt();
			System.out.println("enter the bloodGroup");
			String bloodGroup=sc.next();
			System.out.println("enter the contactNo");
			long contactNo=sc.nextLong();
			System.out.println("enter the email");
			String email=sc.next();
			
			
			Patient patient = new Patient(name,id,bloodGroup,contactNo,email);
			h1.saveDetails(patient);
			h1.getpatientByid(id);
			
		try {
			
		} catch (Exception e) {
			
		}
			
		}
		
//		System.out.println("enter 1 to get all patient details");
//		System.out.println("enter 2 to get patient details by patient id");
//		System.out.println("enter 3 to get patient details by contactNo");		
//		System.out.println("enter 4 to update contact no by id");
//		
//		int option = sc.nextInt();
//		switch(option) {
//		
//		case 1: h1.getDetails();
//		break;
//		
//		
//		case 2: System.out.println("enter the patient id");
//		int  id = sc.nextInt();
//			h1.getpatientByid(id);
//		break;
//		
//		case 3: System.out.println("enter the contactNo");
//		long ContactNo = sc.nextLong();
//		h1.getpatientByContactNo(ContactNo);
//		break;
//		
//		case 4: System.out.println("enter the  id");
//		int Id1 =sc.nextInt();
//		System.out.println("enter the new contact no to update");
//		long newContactNo = sc.nextLong();
//		h1.updateContactNoById(newContactNo, Id1);
//		break;
//		
//	}
	
	}	
}

