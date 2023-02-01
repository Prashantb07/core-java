package com.xworkz.apartmentapp.apartment;

import com.xworkz.apartmentapp.rooms.Rooms;

public class Apartment {
	
	Rooms rooms[];
	int index;
	
	public Apartment() {
		// TODO Auto-generated constructor stub
	}
	
	public Apartment(int size) {
		
		System.out.println("APARTMENT OBJECT IS CREATED");
		rooms = new Rooms[size]; 
	}
	
	public boolean addRooms(Rooms rooms) {
		
		System.out.println("addRooms method started");
		boolean isAddRoom = false;
		
		if(rooms.getRoomNo() != 0 ) {
			
			System.out.println("ROOM IS ADDED");
			this.rooms[index++] = rooms;
			isAddRoom = true;
		}
		System.out.println("addRooms method ended");
		return isAddRoom;
	}
	
	public void getAllRooms() {
		
		System.out.println("inside getAllRooms method");
		System.out.println("ALL ROOMS LIST ARE:");
		for(int i = 0; i < this.rooms.length ;i++) {
			
			System.out.println(rooms[i].getRoomId() + " " + rooms[i].getRoomNo() + " " + rooms[i].getBhk() + " " + rooms[i].getOwnerName() + " " + rooms[i].getOwnerContactNo() );
		}
		  		
	}
	
    public Rooms getRoomByRoomNo (int roomNo) {
    	
    	System.out.println("INSIDE getRoomByRoomNo METHOD");
    	for(int in=0; in< rooms.length; in++) {
    		
    		if(rooms[in].getRoomNo() == roomNo ) {
    			
    			System.out.println("ROOM NUMBER IS MATCHING...PROCEED WITH DISPLAYING THE DATA");
    			System.out.println(rooms[in].getRoomId() + " " + rooms[in].getRoomNo() + " " + rooms[in].getBhk() + " " + rooms[in].getOwnerName() + " " + rooms[in].getOwnerContactNo() );
    			return rooms[in];
    		}
    	}
    		System.out.println("END OF getRoomByRoomNo METHOD");
    		return null;    
     
}
    
    public Rooms getRoomByRoomId (int roomId) {
    	
    	System.out.println("INSIDE getRoomByRoomId METHOD");
    	for(int in=0; in< rooms.length; in++) {
    		
    		if(rooms[in].getRoomId() == roomId ) {
    			
    			System.out.println("ROOM ID IS MATCHING...PROCEED DISPLAYING THE DATA");
    			System.out.println(rooms[in].getRoomId() + " " + rooms[in].getRoomNo() + " " + rooms[in].getBhk() + " " + rooms[in].getOwnerName() + " " + rooms[in].getOwnerContactNo() );
    			return rooms[in];
    		}
    	}
    		System.out.println("END OF getRoomByRoomId METHOD");
    		return null;    
     
}
        
      public Rooms updateContactNoByRoomId(long newContactNo , int roomId ) {
    		
    		System.out.println("INSIDE updateContactNoByRoomId METHOD");
    		for(int b = 0; b < rooms.length; b++ ) {
    			
    			if(rooms[b].getRoomId() == roomId ) {
    				
    				System.out.println("the current contact no is: " + rooms[b].getOwnerContactNo());
    				rooms[b].setOwnerContactNo(newContactNo) ;
    				System.out.println("the new updated name of patient is" + rooms[b].getOwnerContactNo());
    				System.out.println("THE UPDATED OWNER SETAILS ARE : ");
        			System.out.println(rooms[b].getRoomId() + " " + rooms[b].getRoomNo() + " " + rooms[b].getBhk() + " " + rooms[b].getOwnerName() + " " + rooms[b].getOwnerContactNo() );

    			}
    		}
    		System.out.println("END OF updateContactNoByRoomId METHOD");
    		return null;
    	}

}
