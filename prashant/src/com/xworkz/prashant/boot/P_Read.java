package com.xworkz.prashant.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class P_Read {

	public static void main(String[] args) {
		PrashantDTO prashantDTO = new PrashantDTO(1,"BE","Bagalkot",7406050101l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Prashant values (?,?,?,?)";
			PreparedStatement sta = con.prepareStatement(query);
			ResultSet u = sta.executeQuery("select * from Prashant");
			
			while(u.next()) {
				System.out.println(u.getInt(1) + " " + u.getString(2) + " " + u.getString(3) + " " + u.getLong(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
