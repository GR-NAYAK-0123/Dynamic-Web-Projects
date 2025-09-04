package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddProductDAO {
	
	public int insertProduct(ProductBean pb) {
		int rowCount = 0;
		
		try {
			Connection con = DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("insert into Product values (?,?,?,?,?)");
			
			pstm.setString(1, pb.getProductCode());
			pstm.setString(2, pb.getProductName());
			pstm.setString(3, pb.getProductCompany());
			pstm.setString(4, pb.getProductPrice());
			pstm.setString(5, pb.getProductQty());
			
			rowCount = pstm.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}
}
