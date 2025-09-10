package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CreateAccountDAO {
	
	public int insert(Bean b) {
		int rowCount = 0;
		
		try {
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("insert into Facebook values (?,?,?,?,?)");
			
			pstm.setString(1, b.getUserName());
			pstm.setString(2, b.getPassword());
			pstm.setString(3, b.getFirstName());
			pstm.setString(4, b.getLastName());
			pstm.setString(5, b.getMail());
			
			rowCount = pstm.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
