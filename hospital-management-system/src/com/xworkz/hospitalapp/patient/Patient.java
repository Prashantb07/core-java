package com.xworkz.hospitalapp.patient;

public class Patient extends Object {
	
	//public int pat =90;

	private String name;
	private int id;
	private String bloodGroup;
	private long contactNo;
	
	
	public Patient(String name,int id,String bloodGroup,long contactNo) {
		
		this.name=name;
		this.id=id;
		this.bloodGroup=bloodGroup;
		this.contactNo=contactNo;
		
	}
	
	public Patient() {
		
		
	}
	
	public String getname() {
		return name;
		}
	public void setname(String name) {
		this.name= name;
	}
	
	public int getId() {
		return id;	
	}
	public void setName(int id) {
		this.id=id;
	}
	
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup=bloodGroup;
	}
	
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo ) {
		this.contactNo=contactNo;
	}
	
	
}
