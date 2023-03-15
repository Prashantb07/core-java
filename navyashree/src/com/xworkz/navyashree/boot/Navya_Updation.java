package com.xworkz.navyashree.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Navya_Updation {
	
	public static void main(String[] args) {
		NavyashreeDTO navyashreeDTO = new NavyashreeDTO(9,"M.tech","Bangalore",9731714685l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Kshema values (?,?,?,?)";
			PreparedStatement sta = co.prepareStatement(query);
			
			sta.setInt(1, navyashreeDTO.getId());
			sta.setString(2, navyashreeDTO.getQualification());
			sta.setString(3, navyashreeDTO.getPlace());
			sta.setLong(4, navyashreeDTO.getMobileNo());
			
			int i = sta.executeUpdate("update Navyashree set Place='manglore' where id=9");
			
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
