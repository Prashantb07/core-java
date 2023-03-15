package com.xworkz.vijay.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class Inseration {
	
	public static void main(String[] args) {
		VijayDTO vijayDTO = new VijayDTO(3,"Msc","Hassan",7259829359l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Vijay values (?,?,?,?)";
			
			PreparedStatement statement = con.prepareStatement(query);
			
			statement.setInt(1,vijayDTO .getId());
			statement.setString(2, vijayDTO .getQualification());
			statement.setString(3, vijayDTO .getPlace());
			statement.setLong(4, vijayDTO .getMobileNo());
					
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
