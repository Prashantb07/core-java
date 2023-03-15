package com.xworkz.kshema.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Ks_Updation {
	
	public static void main(String[] args) {
		KshemaDTO kshemaDTO = new KshemaDTO(7,"BE","Udapi",8197857508l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Kshema values (?,?,?,?)";
			PreparedStatement sta = co.prepareStatement(query);
			
			sta.setInt(1, kshemaDTO.getId());
			sta.setString(2, kshemaDTO.getQualification());
			sta.setString(3, kshemaDTO.getPlace());
			sta.setLong(4, kshemaDTO.getMobileNo());
			
			int i = sta.executeUpdate("update Kshema set Place='banglore' where id=7");
			
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
