package com.xworkz.satish.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Sati_Delete {
	
	public static void main(String[] args) {
		SatishDTO satishDTO = new SatishDTO(6,"BCA","Basavakalayna",9353472656l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Satish values (?,?,?,?)";
			PreparedStatement sta = con.prepareStatement(query);
			int it = sta.executeUpdate("Delete from Satish where id=6");
			
			if(it != 0 ) {
				System.out.println("Deletion");
			}else {
			System.out.println("Not Deletion");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
