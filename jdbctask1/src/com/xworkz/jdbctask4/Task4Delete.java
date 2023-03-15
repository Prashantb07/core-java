package com.xworkz.jdbctask4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Task4Delete {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/watch","root","Prashant@123");
			Statement sta = con.createStatement();
			int it = sta.executeUpdate("Delete from  watch where id=1");
			
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
