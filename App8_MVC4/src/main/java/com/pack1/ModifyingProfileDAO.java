package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ModifyingProfileDAO {
	
	public int modify(Bean b) {
		int rowCount = 0;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("update Facebook set firstname = ?, lastname = ?, mail = ? where username = ?");
			
			pstm.setString(1, b.getFirstName());
			pstm.setString(2, b.getLastName());
			pstm.setString(3, b.getMail());
			pstm.setString(4, b.getUserName());
			
			rowCount = pstm.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return rowCount;
	}
}
