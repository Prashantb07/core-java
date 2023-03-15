package com.xworkz.likith.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Liki_Updation {
	
	public static void main(String[] args) {
		LikithDTO likithDTO = new LikithDTO(2,"BE","Udapi",9900120608l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Kshema values (?,?,?,?)";
			PreparedStatement sta = co.prepareStatement(query);
			
			sta.setInt(1, likithDTO.getId());
			sta.setString(2, likithDTO.getQualification());
			sta.setString(3, likithDTO.getPlace());
			sta.setLong(4, likithDTO.getMobileNo());
			
			int i = sta.executeUpdate("update Likith set Place='manglore' where id=2");
			
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
