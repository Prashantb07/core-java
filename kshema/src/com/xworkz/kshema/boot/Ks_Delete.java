package com.xworkz.kshema.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Ks_Delete {
	
	public static void main(String[] args) {
		KshemaDTO kshemaDTO = new KshemaDTO(7,"BE","Udapi",8197857508l);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/October_batch","root","Prashant@123");
			String query = "insert into Kshema values (?,?,?,?)";
			PreparedStatement sta = con.prepareStatement(query);
			int it = sta.executeUpdate("Delete from Kshema where id=7");
			
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
