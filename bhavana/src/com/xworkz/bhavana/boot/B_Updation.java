package com.xworkz.bhavana.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class B_Updation {
	
	public static void main(String[] args) {
		BhavanaDTO bhavanaDTO = new BhavanaDTO(8,"BE","Bangalore",6363042834l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Bhavana values (?,?,?,?)";
			PreparedStatement sta = co.prepareStatement(query);
			
			sta.setInt(1, bhavanaDTO.getId());
			sta.setString(2, bhavanaDTO.getQualification());
			sta.setString(3, bhavanaDTO.getPlace());
			sta.setLong(4, bhavanaDTO.getMobileNo());
			
			int i = sta.executeUpdate("update Prashant set Place='banglore' where id=10");
			
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
