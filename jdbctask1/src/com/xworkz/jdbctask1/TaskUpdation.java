package com.xworkz.jdbctask1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TaskUpdation {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1","root","Prashant@123");
			Statement sta = co.createStatement();
			int i = sta.executeUpdate("update shop set location='banglore' where id=5");
			
			if(i != 0) {
				System.out.println("Updation done");
			}else {
				System.out.println("Updation is not done");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
