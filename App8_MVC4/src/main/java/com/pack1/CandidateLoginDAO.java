package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CandidateLoginDAO {
	
	public Bean retrieve(String userName, String password) {
		
		Bean b = null; 
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("select * from Facebook where username = ? and password = ?");
			
			pstm.setString(1, userName);
			pstm.setString(2, password);
			
			ResultSet rs = pstm.executeQuery();
			
			if(rs.next()) {
			    b = new Bean();
				b.setUserName(rs.getString(1));
				b.setPassword(rs.getString(2));
				b.setFirstName(rs.getString(3));
				b.setLastName(rs.getString(4));
				b.setMail(rs.getString(5));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return b;
	}
}
