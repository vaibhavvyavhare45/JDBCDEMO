package com.prowings.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionProvider {
	public static Connection con;
	public static Connection getConnection() {
		try {
			if(con!=null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/college";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url,username,password);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
	}
	
	

}
