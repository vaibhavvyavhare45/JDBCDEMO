package com.prowings.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo2 {
	public static final String url = "jdbc:mysql://localhost:3306/companies";
	public static final String username = "root";
	public static final String password = "root";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		String query = "update employee set eaddr='nagar' where eid=5";
		PreparedStatement stmt = con.prepareStatement(query);

		int row_affected = stmt.executeUpdate();
		System.out.println("Query ok row updated" + row_affected);

	}  

}
