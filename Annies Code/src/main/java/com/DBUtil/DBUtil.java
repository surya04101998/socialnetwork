package com.DBUtil;

import java.sql.*;  
class DBUtil{  
	public static Connection establishConnection(){  
	  Connection conn=null;
 try{  
  
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
 conn=DriverManager.getConnection("url","username","password");  
  
   }  
  
catch(Exception ee){System.out.println(ee);}
 return conn;
  
}
}