package com.xworkz.jdbctask1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
  
public class TaskInseration {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1","root","Prashant@123");
			Statement sta = con.createStatement();
			int i = sta.executeUpdate("insert into shop values (5,'P-101','Pavan-Collections','Rajajinagr')");
			
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
