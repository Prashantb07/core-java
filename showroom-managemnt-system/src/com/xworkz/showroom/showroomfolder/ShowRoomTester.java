package com.xworkz.showroom.showroomfolder; 

import java.util.Scanner;   // built in packages 

public class ShowRoomTester //FQCN - fully Qualified class name = package + classname - Qualified Name

// package are increse the folder

{ 
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scanner.nextInt();
		ShowRoom room = new ShowRoom(size);
		
		for(int i=0; i<size; i++) {
		
	
		
		System.out.println("enter the manager id");
		int managerId = scanner.nextInt();
		
		System.out.println("enter the manager name");
		String managerName = scanner.next();
		
		System.out.println("enter the manager address");
		String managerAdd = scanner.next();
		
		System.out.println("enter the qualification ");
		String managerQuali = scanner.next();
		
		System.out.println("enter the contactnumber");
		Long managerNo = scanner.nextLong();
		
		System.out.println("enter the gender");
		String managerGen = scanner.next();
		
		
		
		
		
		
		Manager manag= new Manager(managerId, managerName, managerAdd, managerQuali, managerNo, managerGen);
		//Manager manag1= new Manager(2, "Vithal","Electroniccity","B.E", 7022716266l,"Male");
		//Manager manag2= new Manager(3,"Abhi","Laxmipura","B.E", 7406050101l , "");
		
		room.saveManager(manag);
		//room.saveManager(manag1);
		//room.saveManager(manag2);
		}
		room.getAllManager();
		room.getManagerByManagerQualification("B.com");
		room.getManagerByManagerAddress("Vijayanagar");
		room.getManagerByContactNo(9876542222l);
		room.getManagerByManagerName("Pavan");
		//room.getManagerByManagerGender("Female");  not getting female details doubt
		room.getManagerByManagerGender("male");
		//room.updateManagerContactNoById(8899775522l, 3);
		room.updateManagerNamebyId("sonu", 3);
		
		scanner.close();
	}

}
