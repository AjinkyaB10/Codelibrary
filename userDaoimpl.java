package com.Backend.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Backend.DBUtil.DbUtil;

public class userDaoimpl implements UserDao{

	@Override
	public boolean isValidUser(String username, String password) {
		String query="Select * from users where username=? and password=?";
		
		try {
			Connection con=DbUtil.getConnection();
			System.out.println("Database connected.");
			PreparedStatement pst=con.prepareStatement(query);
			
			pst.setString(1,username);
			pst.setString(2,password);
			
			ResultSet rs= pst.executeQuery();
			return rs.next();
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean addUser(User user) {
		String query="INSERT INTO users(username,email,password) VALUES(?,?,?)";
		try {
			Connection con=DbUtil.getConnection();
			System.out.println("Database connected.");
			PreparedStatement pst=con.prepareStatement(query);
			
			pst.setString(1,user.getUsername());
			pst.setString(2,user.getEmail());
			pst.setString(3,user.getPassword());
			
			int rows= pst.executeUpdate();
			System.out.println("Data added successfully.");
			return rows>0;
			}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
