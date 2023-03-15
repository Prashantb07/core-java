package com.xworkz.laxmi.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class L_Updation {
	
	public static void main(String[] args) {
		LaxmiDTO laxmiDTO = new LaxmiDTO(10,"BE","Bangalore",9060919735l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Kshema values (?,?,?,?)";
			PreparedStatement sta = co.prepareStatement(query);
			
			sta.setInt(1, laxmiDTO.getId());
			sta.setString(2, laxmiDTO.getQualification());
			sta.setString(3, laxmiDTO.getPlace());
			sta.setLong(4, laxmiDTO.getMobileNo());
			
			int i = sta.executeUpdate("update Laxmi set Place='manglore' where id=10");
			
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
