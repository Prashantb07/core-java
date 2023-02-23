package com.xworkz.bankapp.customer;

public class Customer {
	
	private String name;
	private int accountNo;
	private String ifscCode; //updateBranchByCustomerName()
	private long contactNo;

	
public Customer (String name,int accountNo,String ifscCode,long contactNo)	{

this.name=name;
this.accountNo=accountNo;
this.ifscCode=ifscCode;
this.contactNo=contactNo;

	}
public Customer () {

}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String getIfscCode() {
	return ifscCode;
}
public void setIfscCode(String ifscCode) {
	this.ifscCode = ifscCode;
}
public long getContactNo() {
	return contactNo;
}
public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}

	 	

}
