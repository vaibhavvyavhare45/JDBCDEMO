package com.prowings.jdbcdemo;
import java.sql.*;
public class JDBCDemo {
	public static final String dburl="jdbc:mysql://localhost:3306/companies";
	public static final String dbusername="root";
	public static final String dbpassword="root";
	
	public static void main(String[] args) throws Exception,SQLException {
		System.out.println("*****Hello JDBC*****");
		Class.forName("com.mysql.cj.jdbc.Driver");//register the driver of the  vendor(mySql)
		Connection con =DriverManager.getConnection(dburl,dbusername,dbpassword);
		Statement stmt =con.createStatement();
		String query= "select * from car";
		ResultSet rs =stmt.executeQuery(query);
		
		while(rs.next()) {
			 int cId=rs.getInt(1);
			 String cName=rs.getString(2);
			 double cPrice=rs.getDouble(3);
			 String cColor=rs.getString(4);
			 System.out.println("cid:"+cId+"\tcname:\t"+cName+"\t\tcprice:\t"+cPrice +"\t\tccolor:  "+cColor);

		}
		

		
	}

}
