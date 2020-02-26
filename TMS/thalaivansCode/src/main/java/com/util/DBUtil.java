package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static Connection conn=null;
	
	public static Connection provideConnection() {
		
	if(conn == null) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String cs="jdbc:mysql://localhost:3306/db";
		
		try {
			conn=DriverManager.getConnection(cs,"root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
		return conn;
		
	}
	
	

}
