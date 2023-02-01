package com.xworkz.apartmentapp;

import java.util.Scanner;

import com.xworkz.apartmentapp.apartment.Apartment;
import com.xworkz.apartmentapp.rooms.Rooms;

public class ApartmentRoomsTester {
	
public static void main(String[] args) {
		
        System.out.println("MAIN METHOD HAS STARTED");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE SIZE");
		int size = scan.nextInt();
		
		Apartment apart1 = new Apartment(size);
		for(int i = 0; i < size; i++) {
			

			
			Rooms r1 = new Rooms();
			
			System.out.println("ENTER ROOM ID");
			int roomId = scan.nextInt();
			r1.setRoomId(roomId);
			
			System.out.println("ENTER ROOM NO");
			int roomNo = scan.nextInt();
			r1.setRoomNo(roomNo);
			
			System.out.println("ENTER BHK");
			int bhk = scan.nextInt();
			r1.setBhk(bhk);
			
			System.out.println("ENTER OWNER NAME");
			String ownerName = scan.next();
			r1.setOwnerName(ownerName);
			
			System.out.println("ENTER OWNER CONTACT NO");
			long ownerContactNo = scan.nextLong();
			r1.setOwnerContactNo(ownerContactNo);
			
			apart1.addRooms(r1);
			
		}
		
		System.out.println("enter 1 to get all rooms details");
		System.out.println("enter 2 to get room details by room id");
		System.out.println("enter 3 to get room details by room number");		
		System.out.println("enter 4 to update owner contact no by room id");
		
		
		int option = scan.nextInt();
		switch(option) {
		
		case 1: apart1.getAllRooms();
		break;
		
		case 2: System.out.println("enter the room id");
		int  roomId = scan.nextInt();
		apart1.getRoomByRoomId(roomId);
		break;
		
		case 3: System.out.println("enter the room number");
		int  roomNo = scan.nextInt();
		apart1.getRoomByRoomNo(roomNo);
		break;
		
		case 4: System.out.println("enter the room id");
		int roomId1 = scan.nextInt();
		System.out.println("enter the new contact no to update");
		long newContactNo = scan.nextLong();
		apart1.updateContactNoByRoomId(newContactNo, roomId1);
		break;
		
		}
		
        System.out.println("MAIN METHOD HAS ENDED");
        scan.close();
     
	}

	

}
