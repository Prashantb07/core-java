package com.xworkz.satish.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Sati_Updation {
	
	public static void main(String[] args) {
		SatishDTO satishDTO = new SatishDTO(6,"BCA","Basavakalayna",9353472656l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into satish values (?,?,?,?)";
			PreparedStatement sta = co.prepareStatement(query);
			
			sta.setInt(1, satishDTO.getId());
			sta.setString(2, satishDTO.getQualification());
			sta.setString(3, satishDTO.getPlace());
			sta.setLong(4, satishDTO.getMobileNo());
			
			int i = sta.executeUpdate("update Satish set Place='banglore' where id=6");
			
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
