package com.xworkz.someapp.manager;

// Encapsulated Class
public class Manager extends Object {
	
	private String managerName;
	private int managerId;
	private String address;
	private String gender;
	private String qualification;
	private long contactNo;
	
	


public Manager(String managerName, int managerId, String address, String gender, String qualification,
			long contactNo) {
		super();
		this.managerName = managerName;
		this.managerId = managerId;
		this.address = address;
		this.gender = gender;
		this.qualification = qualification;
		this.contactNo = contactNo;
	}

public Manager() {
	// TODO Auto-generated constructor stub
}

public String getManagerName() {
	return managerName;
}

public void setManagerName(String managerName) {
	this.managerName = managerName;
}

public int getManagerId() {
	return managerId;
}

public void setManagerId(int managerId) {
	this.managerId = managerId;
}

public String getAddress() {
	return address;
} 

public void setAddress(String address) {
	this.address = address;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

public long getContactNo() {
	return contactNo;
}

public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}




}



