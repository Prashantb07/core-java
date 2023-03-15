package com.xworkz.kiran.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class K_Updation {
	
	public static void main(String[] args) {
		KiranDTO kiranDTO = new KiranDTO(4,"BE","Raibag",7795656468l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Kiran values (?,?,?,?)";
			PreparedStatement sta = co.prepareStatement(query);
			
			sta.setInt(1, kiranDTO.getId());
			sta.setString(2, kiranDTO.getQualification());
			sta.setString(3, kiranDTO.getPlace());
			sta.setLong(4, kiranDTO.getMobileNo());
			
			int i = sta.executeUpdate("update Kiran set Place='banglore' where id=4");
			
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
