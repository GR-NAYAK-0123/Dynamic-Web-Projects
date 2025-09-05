package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserRegistrationDAO {
	
	public int register(UserBean ub) {
		int rowCount = 0;
		
		try {
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("insert into Registration values (?,?,?,?,?,?)");
			
			pstm.setString(1, ub.getUserName());
			pstm.setString(2, ub.getPassword());
			pstm.setString(3, ub.getFirstName());
			pstm.setString(4, ub.getLstName());
			pstm.setString(5, ub.getMailId());
			pstm.setString(6, ub.getPhone());
			
			rowCount = pstm.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
