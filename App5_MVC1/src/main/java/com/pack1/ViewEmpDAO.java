package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewEmpDAO {
	
	public ArrayList<EmployeeBean> al = new ArrayList<EmployeeBean>();
	
	public ArrayList<EmployeeBean> retrieve(){
		
		try {
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("select * from Employee");
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				EmployeeBean eb = new EmployeeBean();
				
				eb.setEmpId(rs.getString(1));
				eb.setEmpFName(rs.getString(2));
				eb.setEmpLName(rs.getString(3));
				eb.setEmpSal(rs.getInt(4));
				eb.setEmpAdd(rs.getString(5));
				
				al.add(eb);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
