package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserLoginDAO {
	
	public UserBean retrieve(String uname, String upwd) {
		UserBean ub = null;
		
		try {
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("select * from Registration where username = ? and password = ?");
			
			pstm.setString(1, uname);
			pstm.setString(2, upwd);
			
			ResultSet rs = pstm.executeQuery();
			
			if(rs.next()) {
				ub = new UserBean();
				
				ub.setUserName(rs.getString(1));
				ub.setPassword(rs.getString(2));
				ub.setFirstName(rs.getString(3));
				ub.setLastName(rs.getString(4));
				ub.setMailId(rs.getString(5));
				ub.setPhone(rs.getString(6));
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ub;
	}
}
