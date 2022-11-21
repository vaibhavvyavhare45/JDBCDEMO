package com.prowings.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


public class JDBCDemo1 {
	
	public static final String url="jdbc:mysql://localhost:3306/companies";
	public static final String username="root";
	public static final String password="root";

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt =con.createStatement();
		//String query="select * from employee where ename like'_a%'";
		String insert_query="insert into employee values(6,'ganesh','male','amravati',6,6)";
		int rows_affected=stmt.executeUpdate(insert_query);
		System.out.println("query ok one row affected"+rows_affected);
				
		
	}

}
