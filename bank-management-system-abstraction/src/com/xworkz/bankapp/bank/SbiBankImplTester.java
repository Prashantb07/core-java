package com.xworkz.bankapp.bank;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class SbiBankImplTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		SbiBankImpl bank = new SbiBankImpl(size);
		for(int i=0;i<size;i++) {
		
		System.out.println("please enter the name");
		String name = sc.next();
		System.out.println("please enter account no");
		int accountNo = sc.nextInt();
		System.out.println("please enter Ifsc Code");
		String ifscCode = sc.next();
		System.out.println("please enter contactNo");
		long contactNo = sc.nextLong();
		
		
		Customer customer = new Customer(name, accountNo, ifscCode, contactNo);
		bank.saveDetails(customer);
		}
		
		
		bank.getallDetails();
		System.out.println("please enter accountNo");
		long contactNo = sc.nextLong();
	bank.getById(contactNo);
	

	}
}
