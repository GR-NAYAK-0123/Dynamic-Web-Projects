package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddEmpDAO {
	
	public int insertData(EmployeeBean eb) {
		int rowCount = 0;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("insert into Employee values (?,?,?,?,?)");
			
			pstm.setString(1, eb.getEmpId());
			pstm.setString(2, eb.getEmpFName());
			pstm.setString(3, eb.getEmpLName());
			pstm.setInt(4, eb.getEmpSal());
			pstm.setString(5, eb.getEmpAdd());
			
			rowCount = pstm.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return rowCount;
	}
}
