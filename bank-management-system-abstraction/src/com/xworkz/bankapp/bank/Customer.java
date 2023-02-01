package com.xworkz.bankapp.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Customer {

	private String name;
	private int accountNo;
	private String ifscCode;
	private long contactNo;
	
	public Customer(String name, int accountNo, String ifscCode, long contactNo) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.ifscCode = ifscCode;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Customer (Name = " + this.name + " , AccountNo=" + this.accountNo + " , IfscCode = " + this.ifscCode
				+ " , ContactNo = " + this.contactNo + ")";
		
	}

}
