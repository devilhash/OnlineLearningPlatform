package com.karthik.learnit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.karthik.learnit.dto.User;
 

public class UserDao {
	Connection con;
	String userSQL ="root";
	String passwordSQL = "karthik";
	 
	public UserDao() throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/learnify",userSQL ,passwordSQL);
 
		}
	public int saveDetails(User u) throws SQLException {
		Statement st = con.createStatement();
		String query = "insert into user_info(phno,userName,email,address,city,college)"+ "values('"+u.getPhno()+"','"+u.getUserName()+"','"+u.getEmail()+"','"+u.getAddress()+"','"+u.getCity()+"','"+ u.getCollege()+"')";
		return st.executeUpdate(query);
	}
}
