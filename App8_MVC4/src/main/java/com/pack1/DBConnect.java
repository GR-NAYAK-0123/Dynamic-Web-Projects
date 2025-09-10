package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public static Connection con = null;
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(DBInfo.url, DBInfo.userName, DBInfo.pwd);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		return con;
	}
}
