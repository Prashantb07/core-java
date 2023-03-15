package com.xworkz.jdbctask2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Task2Inseration {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task2","root","Prashant@123");
			Statement sta = con.createStatement();
			int i = sta.executeUpdate("insert into watch values (1,'fastrack-watch','Fastrack',3500)");
			
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
