package com.xworkz.prashant.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Inseration {

	public static void main(String[] args) {
		PrashantDTO prashantDTO = new PrashantDTO(1,"BE","Bagalkot",7406050101l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Prashant values (?,?,?,?)";
			
			PreparedStatement statement = con.prepareStatement(query);
			
			statement.setInt(1, prashantDTO.getId());
			statement.setString(2, prashantDTO.getQualification());
			statement.setString(3, prashantDTO.getPlace());
			statement.setLong(4, prashantDTO.getMobileNo());
					
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
