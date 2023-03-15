package com.xworkz.vijay.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Viji_Updation {
	
	public static void main(String[] args) {
		VijayDTO vijayDTO = new VijayDTO(3,"Msc","Hassan",7259829359l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Vijay values (?,?,?,?)";
			PreparedStatement sta = co.prepareStatement(query);
			
			sta.setInt(1, vijayDTO.getId());
			sta.setString(2, vijayDTO.getQualification());
			sta.setString(3, vijayDTO.getPlace());
			sta.setLong(4, vijayDTO.getMobileNo());
			
			int i = sta.executeUpdate("update Vijay set Place='banglore' where id=3");
			
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
