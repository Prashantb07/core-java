package com.xworkz.subash.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Subash_Updation {
	
	public static void main(String[] args) {
		SubashDTO subashDTO = new SubashDTO(5,"BE","Bangalore",8548058481l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Subash values (?,?,?,?)";
			PreparedStatement sta = co.prepareStatement(query);
			
			sta.setInt(1, subashDTO.getId());
			sta.setString(2, subashDTO.getQualification());
			sta.setString(3, subashDTO.getPlace());
			sta.setLong(4, subashDTO.getMobileNo());
			
			int i = sta.executeUpdate("update subash set Place='goa' where id=5");
			
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
