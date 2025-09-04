package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aps")
public class AddProductServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		ProductBean pb = new ProductBean();
		
		pb.setProductCode(req.getParameter("pcode"));
		pb.setProductName(req.getParameter("pname"));
		pb.setProductCompany(req.getParameter("pcom"));
		pb.setProductPrice(req.getParameter("pprice"));
		pb.setProductQty(req.getParameter("pqty"));
		
		AddProductDAO apd = new AddProductDAO();
		int rowCount = apd.insertProduct(pb);
		
		if(rowCount > 0) {
			req.setAttribute("msg", "Data Inserted Successfully");
			RequestDispatcher rd = req.getRequestDispatcher("AddProduct.jsp");
			rd.forward(req, res);		
		}
	}
}
