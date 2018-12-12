 package com.ujjwal.newsportal.db;
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnect {

	public static Connection getMysqlConnection() {
		Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/kantipur","root","");
		}
		catch (Exception e) {		
		}
		return con;
	}
}
