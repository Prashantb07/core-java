package com.xworkz.bankapp.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class SbiBankImpl implements Bank {

	Customer customer[];
	int i;
	
	public SbiBankImpl (int size) {
		customer = new Customer[size];
	}
	
	@Override
	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getallDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveDetails(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public void getById(long accountNo) {
		// TODO Auto-generated method stub
		
	}

}
