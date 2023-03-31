package com.xworkz.shoppingTask.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xworkz.shoppingTask.DTO.ShoppingsDTO;

public class ShoppingsrepoImpl  implements Shoppingsrepo{

	public ShoppingsrepoImpl() {
		System.out.println("shoppingRepositoryImplementation");
	}
	
	@Override
	public boolean onSave(ShoppingsDTO dto) {
		System.out.println("This is onSave");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/work","root","Prashant@123");
			String query="insert into shopping values(?,?,?)";
			PreparedStatement st=con.prepareStatement(query);
			
			st.setInt(1, dto.getId());
			st.setString(2, dto.getName());
			st.setString(3, dto.getEmail());
			
			int i=st.executeUpdate();
			if(i!=0) {
				System.out.println("Data saved successfully");
			}
			else {
				System.out.println("Data not saved");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public boolean readByEmail(String email) {
		System.out.println("This is readByEmail");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/work","root","Prashant@123");
			String query="select * from shopping where email=?";
			PreparedStatement st=con.prepareStatement(query);
			
			st.setString(1, email);
			
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				System.out.println("Id:"+rs.getInt(1)+" "+"Name:"+rs.getString(2)+" "+"Email:"+rs.getString(3));
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean readByName(String name) {
		System.out.println("This is readBYName");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/work","root","Prashant@123");
			String query="select * from shopping where name=?";
			PreparedStatement st=con.prepareStatement(query);
			
			st.setString(1, name);
			
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				System.out.println("Id:"+rs.getInt(1)+" "+"Name:"+rs.getString(2)+" "+"Email:"+rs.getString(3));
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean readAll(ShoppingsDTO dto) {
		System.out.println("This is readAll");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/work","root","Prashant@123");
			String query="select * from shopping ";
			PreparedStatement st=con.prepareStatement(query);
			
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				System.out.println("Id:"+rs.getInt(1)+" "+"Name:"+rs.getString(2)+" "+"Email:"+rs.getString(3));
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	

	@Override
	public boolean updateById(int id) {
		System.out.println("This is updateById");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/work","root","Prashant@123");
			String query="update shopping set name=? where id=?";
			PreparedStatement st=con.prepareStatement(query);
			
			String name="Trends";
			int id1=id;
			
			st.setString(1, name);
			st.setInt(2, id1);
			
			int i=st.executeUpdate();
			if(i!=0) {
				System.out.println("Updated successfully");
			}	
			else {
				System.out.println("Not updated ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean updateByName(String name) {
		System.out.println("This is updateByName");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/work","root","Prashant@123");
			String query="update shopping set email=? where name=?";
			PreparedStatement st=con.prepareStatement(query);
			
			String email="zudio@gmail.com";
			String name1=name;
			
			st.setString(1, email);
			st.setString(2, name1);
			
			int i=st.executeUpdate();
			if(i!=0) {
				System.out.println("Updated successfully");
			}	
			else {
				System.out.println("Not updated ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean updateByEmail(String email) {
		System.out.println("This is updateByEmail");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/work","root","Prashant@123");
			String query="update shopping set name=? where email=?";
			PreparedStatement st=con.prepareStatement(query);
			
			String name="ABCD";
			String email1=email;
			
			st.setString(1, name);
			st.setString(2, email1);
			
			int i=st.executeUpdate();
			if(i!=0) {
				System.out.println("Updated successfully");
			}	
			else {
				System.out.println("Not updated ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}


	@Override
	public boolean deleteById(int id) {
		System.out.println("This is deleteById");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/work","root","Prashant@123");
			String query="delete from shopping where id=?";
			PreparedStatement st=con.prepareStatement(query);
			
			st.setInt(1, id);
			
			int i=st.executeUpdate();
			if(i!=0) {
				System.out.println("Deleted successfully");
			}	
			else {
				System.out.println("Not Deleted ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean deleteByEmail(String email) {
		System.out.println("This is deleteByEmail");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/work","root","Prashant@123");
			String query="delete from shopping where email=?";
			PreparedStatement st=con.prepareStatement(query);
			
			st.setString(1, email);
			
			int i=st.executeUpdate();
			if(i!=0) {
				System.out.println("Deleted successfully");
			}	
			else {
				System.out.println("Not deleted ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
