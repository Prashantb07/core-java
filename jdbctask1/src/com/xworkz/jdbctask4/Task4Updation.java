package com.xworkz.jdbctask4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Task4Updation {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/task4","root","Prashant@123");
			Statement sta = co.createStatement();
			int i = sta.executeUpdate("update mobile set mobile_name='Nokia' where id=7");
			
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
