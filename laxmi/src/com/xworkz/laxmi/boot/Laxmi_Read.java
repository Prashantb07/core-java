package com.xworkz.laxmi.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Laxmi_Read {

	public static void main(String[] args) {
		LaxmiDTO laxmiDTO = new LaxmiDTO(10,"BE","Bangalore",9060919735l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Laxmi values (?,?,?,?)";
			PreparedStatement sta = con.prepareStatement(query);
			ResultSet u = sta.executeQuery("select * from Laxmi");
			
			while(u.next()) {
				System.out.println(u.getInt(1) + " " + u.getString(2) + " " + u.getString(3) + " " + u.getLong(4));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
