package com.xworkz.hospitalapp.hospital;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ApolloHospitalImpl implements Hospital{

	Patient patient[];
	int i;
	
	
	public ApolloHospitalImpl (int size) {
	 patient = new Patient[size];
	}
	
	/*
	public Patient saveDetails(Patient patient ) {
		if(patient.getname()!=null && patient.getname()!="") {
			this.patient[i++]=patient;
		}
		return null;
	}
	
	public  void getDetails() {
		
		for(int i=0;i<patient.length;i++) {
			System.out.println(patient[i]);
		}
	}
		
public Patient getpatientByid (int roomNo) {
    	
    	System.out.println("INSIDE getpatientByid METHOD");
    	for(int in=0; in< patient.length; in++) {
    		
    		if(patient[in].getContactNo() == roomNo ) {
    			
    			System.out.println("patient IS MATCHING...PROCEED WITH DISPLAYING THE DATA");
    			System.out.println(patient[i].getname() + " " + patient[i].getId() + " " + patient[i].getBloodGroup() + " " + patient[i].getContactNo() );
    			return patient[i];
    		}
    	}
    		System.out.println("END OF getpatientByid METHOD");
    		return null;    
     
}
    
    public Patient getpatientByContactNo (long contactNo) {
    	
    	System.out.println("INSIDE getpatientByContactNo METHOD");
    	for(int in=0; in< patient.length; in++) {
    		
    		if(patient[in].getContactNo() == contactNo ) {
    			
    			System.out.println("Patient ID IS MATCHING...PROCEED DISPLAYING THE DATA");
    			System.out.println(patient[i].getname() + " " + patient[i].getId() + " " + patient[i].getBloodGroup() + " " + patient[i].getContactNo() );
    			return patient[i];
    		}
    	}
    		System.out.println("END OF getpatientByContactNo METHOD");
    		return null;    
     
}
        
      public Patient updateContactNoById(long newContactNo , int roomId ) {
    	  
    		
    		System.out.println("INSIDE updateContactNoByRoomId METHOD");
    		for(int b = 0; b < patient.length; b++ ) {
    			
    			if(patient[b].getId() == roomId ) {
    				
    				System.out.println("the current contact no is: " + patient[b].getContactNo());
    				patient[b].setContactNo(newContactNo) ;
    				System.out.println("the new updated name of patient is" + patient[b].getContactNo());
    				System.out.println("THE UPDATED PATIENT ARE : ");
        			System.out.println(patient[i].getname() + " " + patient[i].getId() + " " + patient[i].getBloodGroup() + " " + patient[i].getContactNo() );

    			}
    		}
    		System.out.println("END OF updateContactNoById METHOD");
    		return null;
    	}
    	
    	*/

	@Override
	public boolean addPatient(Patient patient) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getallPatient() {
		// TODO Auto-generated method stub
		
	}

	public void canteen() {
		// TODO Auto-generated method stub
		
	}

	
}
