package com.xworkz.jdbctask4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Task4Inseration {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task4","root","Prashant@123");
			Statement sta = con.createStatement();
			int i = sta.executeUpdate("insert into mobile values (7,'Sumsang_galaxy_A20s','sumsang',1800)");
			
			if(i != 0) {
				System.out.println("data inserterd");
			}else {
				System.out.println("data is not inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
