package com.xworkz.likith.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Inseration {
	
	public static void main(String[] args) {
		LikithDTO likithDTO = new LikithDTO(2,"BE","Udapi",9900120608l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Bhavana values (?,?,?,?)";
			
			PreparedStatement statement = con.prepareStatement(query);
			
			statement.setInt(1,likithDTO .getId());
			statement.setString(2, likithDTO .getQualification());
			statement.setString(3, likithDTO .getPlace());
			statement.setLong(4, likithDTO .getMobileNo());
					
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
