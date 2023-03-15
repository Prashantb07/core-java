package com.xworkz.laxmi.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Laxmi_Delete {
	
	public static void main(String[] args) {
		LaxmiDTO laxmiDTO = new LaxmiDTO(10,"BE","Bangalore",9060919735l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Laxmi values (?,?,?,?)";
			PreparedStatement sta = con.prepareStatement(query);
			int it = sta.executeUpdate("Delete from Laxmi where id=10");
			
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
