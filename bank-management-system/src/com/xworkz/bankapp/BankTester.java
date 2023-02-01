package com.xworkz.bankapp;

import java.util.Scanner;

import com.xworkz.bankapp.bank.Bank;
import com.xworkz.bankapp.customer.Customer;

public class BankTester {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		Bank bank = new Bank(size);
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
		
		
		bank.getDetails();
		System.out.println("please enter accountNo");
		int accountNo = sc.nextInt();
	//bank.getById(accountNo);
	

}
	
}
