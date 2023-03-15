package com.xworkz.kiran.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class Inseration {
	
	public static void main(String[] args) {
		KiranDTO kiranDTO = new KiranDTO(4,"BE","Raibag",7795656468l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Bhavana values (?,?,?,?)";
			
			PreparedStatement statement = con.prepareStatement(query);
			
			statement.setInt(1,kiranDTO.getId());
			statement.setString(2, kiranDTO.getQualification());
			statement.setString(3, kiranDTO.getPlace());
			statement.setLong(4, kiranDTO.getMobileNo());
					
			int i = statement.executeUpdate();
			if(i != 0) {
				System.out.println("data inserterd");
			}else {
				System.out.println("data is not inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ClassNotFoundException");
		}

	}


}
