package com.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	private static Connection con = null;
	private static Properties props = new Properties();
	

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
	    
			
			//FileInputStream fis = null;
			//fis = new FileInputStream("/TMS/src/main/java/com/service/database.properties");
			//props.load(fis);
			
			// load the Driver Class
			Class.forName(props.getProperty("com.mysql.jdbc.Driver"));

			// create the connection snow
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","root");
            
	    
		return con;	
	}
}
