package com.xworkz.kshema.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class Inseration {
	
	public static void main(String[] args) {
		KshemaDTO kshemaDTO = new KshemaDTO(7,"BE","Udapi",8197857508l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Bhavana values (?,?,?,?)";
			
			PreparedStatement statement = con.prepareStatement(query);
			
			statement.setInt(1,kshemaDTO.getId());
			statement.setString(2, kshemaDTO.getQualification());
			statement.setString(3, kshemaDTO.getPlace());
			statement.setLong(4, kshemaDTO.getMobileNo());
					
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
