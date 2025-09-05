package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProfileDAO {
	
	public int update(UserBean ub) {
		int rowCount = 0;
		
		try {
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("update Registration set firstname = ?, lastname = ?, mailid = ?, phone = ? where username = ?");
			
			pstm.setString(1, ub.getFirstName());
			pstm.setString(2, ub.getLstName());
			pstm.setString(3, ub.getMailId());
			pstm.setString(4, ub.getPhone());
			pstm.setString(5, ub.getUserName());
			
			rowCount = pstm.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return rowCount;
	}
}
