package com.xworkz.prashant.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class P_Updation {
	
	public static void main(String[] args) {
		PrashantDTO prashantDTO = new PrashantDTO(1,"BE","Bagalkot",7406050101l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Prashant values (?,?,?,?)";
			PreparedStatement sta = co.prepareStatement(query);
			
			sta.setInt(1, prashantDTO.getId());
			sta.setString(2, prashantDTO.getQualification());
			sta.setString(3, prashantDTO.getPlace());
			sta.setLong(4, prashantDTO.getMobileNo());
			
			int i = sta.executeUpdate("update Prashant set Place='banglore' where id=1");
			
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
