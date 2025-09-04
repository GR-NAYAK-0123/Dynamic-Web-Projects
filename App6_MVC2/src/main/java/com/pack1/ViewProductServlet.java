package com.pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/View")
public class ViewProductServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		ViewProductDAO vpd = new ViewProductDAO();
		ArrayList<ProductBean> al = vpd.retrieve();
		
		req.setAttribute("list", al);
		RequestDispatcher rd = req.getRequestDispatcher("ViewProduct.jsp");
		rd.forward(req, res);
	}
}
