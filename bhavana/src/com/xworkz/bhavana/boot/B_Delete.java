package com.xworkz.bhavana.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class B_Delete {
	
	public static void main(String[] args) {
		BhavanaDTO bhavanaDTO = new BhavanaDTO(8,"BE","Bangalore",6363042834l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Bhavana values (?,?,?,?)";
			PreparedStatement sta = con.prepareStatement(query);
			int it = sta.executeUpdate("Delete from Bhavana where id=8");
			
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
