package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewProductDAO {
	
	public ArrayList<ProductBean> al = new ArrayList<ProductBean>();
	
	public ArrayList<ProductBean> retrieve(){
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("select * from Product");
			
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				ProductBean pb = new ProductBean();
				
				pb.setProductCode(rs.getString(1));
				pb.setProductName(rs.getString(2));
				pb.setProductCompany(rs.getString(3));
				pb.setProductPrice(rs.getString(4));
				pb.setProductQty(rs.getString(5));
				
				al.add(pb);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
