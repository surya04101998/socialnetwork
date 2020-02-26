package com.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	
	private static Properties props = new Properties();
	

	public static Connection getConnection()  {
	    
		  Connection con = null;
			//FileInputStream fis = null;
			//fis = new FileInputStream("/TMS/src/main/java/com/service/database.properties");
			//props.load(fis);
			
			// load the Driver Class
			//Class.forName(props.getProperty("com.mysql.jdbc.Driver"));

			// create the connection snow
            try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prosact", "root", "root");

	    		System.out.println("printlou");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		System.out.println("printlou2");
	    
		return con;	
	}
}
