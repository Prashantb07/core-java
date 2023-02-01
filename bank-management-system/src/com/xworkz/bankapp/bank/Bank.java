package com.xworkz.bankapp.bank;

import com.xworkz.bankapp.customer.Customer;

public class Bank {


	Customer customer[];
	 int i;
	 
	 
	
		public Bank(int size) {
			customer = new Customer[size];
	}

		public Customer saveDetails(Customer customer) {
			//boolean isAdded = false;
			if(customer.getName() != null && customer.getName() != ""){
				this.customer[i++]= customer;
				//isAdded = true;
			}
			
		return null;
		}
		
		public void getDetails() {
			for(int i=0;i<customer.length;i++) {
				System.out.println(customer[i].getName() +" "+customer[i].getAccountNo() +" "+customer[i].getIfscCode() +" "+customer[i].getContactNo());
			}
		
			
			
		}
		
		public Customer getById(int customerId) {
			for(int i=0; i<customer.length; i++) {
				System.out.println("customer[i]");
			
				if(customer[i].getContactNo() == customerId) {
					System.out.println(customer[i].getName()+ " "+customer[i].getAccountNo()+ " "+customer[i].getContactNo()+ " "+customer[i].getContactNo());	
				}
			}
			return null;
		}

			public Customer updateNameBycustomerId(String newName, int customerId) {
				for(int i=0; i<customer.length;i++) {
					if(customer[i].getContactNo() == customerId) {
						customer[i].setName(newName);
						System.out.println(customer[i].getName()+ " "+customer[i].getAccountNo()+ " "+customer[i].getContactNo()+ " "+customer[i].getContactNo());	
					}
				
				}
				return null;
				
				
				
			}

			
	}