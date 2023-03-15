package com.xworkz.kiran.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class K_Delete {
	
	public static void main(String[] args) {
		KiranDTO kiranDTO = new KiranDTO(4,"BE","Raibag",7795656468l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Kiran values (?,?,?,?)";
			PreparedStatement sta = con.prepareStatement(query);
			int it = sta.executeUpdate("Delete from Kiran where id=4");
			
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
