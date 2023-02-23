package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.exception.IdNotFoundException;
import com.xworkz.hospitalapp.patient.Patient;

public class Hospital{
	
	//public int jin=55;
	
	Patient patient[];
	int i;
	
	public Hospital() {
		
	}
	public Hospital (int size) {
	 patient = new Patient[size];
	}
	
	public Patient saveDetails(Patient patient ) {
		if(patient.getname()!=null && patient.getname()!="") {
			this.patient[i++]=patient;
		}
		return null;
	}
	
	public  void getDetails() {
		
		for(int i=0;i<patient.length;i++) {
			System.out.println(patient[i].getname()+ " " + patient[i].getId()+ " " + patient[i].getBloodGroup()+ " " + patient[i].getContactNo()+" "+patient[i].getEmail());
		}
	}
		
public Patient getpatientByid (int roomNo) throws IdNotFoundException {
    	
    	System.out.println("INSIDE getpatientByid METHOD");
    	for(int in=0; in< patient.length; in++) {
    		
    		if(patient[in].getContactNo() == roomNo ) {
    			
    			System.out.println("patient IS MATCHING...PROCEED WITH DISPLAYING THE DATA");
    			System.out.println(patient[i].getname() + " " + patient[i].getId() + " " + patient[i].getBloodGroup() + " " + patient[i].getContactNo() +" "+patient[i].getEmail());
    			return patient[i];
    		} else {
    			throw new IdNotFoundException();
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
    			System.out.println(patient[i].getname() + " " + patient[i].getId() + " " + patient[i].getBloodGroup() + " " + patient[i].getContactNo()+" "+patient[i].getEmail() );
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
        			System.out.println(patient[i].getname() + " " + patient[i].getId() + " " + patient[i].getBloodGroup() + " " + patient[i].getContactNo()+" "+patient[i].getEmail() );

    			}
    		}
    		System.out.println("END OF updateContactNoById METHOD");
    		return null;
    	}


}
	


