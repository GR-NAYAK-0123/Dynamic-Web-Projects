package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public static Connection con = null;
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(ProductInfo.url, ProductInfo.userName, ProductInfo.pwd);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		return con;
	}
}
