package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aes")
public class AddEmpServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		EmployeeBean ebean = new EmployeeBean();
		
		ebean.setEmpId(req.getParameter("eid"));
		ebean.setEmpFName(req.getParameter("efname"));
		ebean.setEmpLName(req.getParameter("elname"));
		ebean.setEmpSal(Integer.parseInt(req.getParameter("esal")));
		ebean.setEmpAdd(req.getParameter("eadd"));
		
		AddEmpDAO aed = new AddEmpDAO();
		int rowCount = aed.insertData(ebean);
		
		if(rowCount > 0) {
			req.setAttribute("msg", "Data Inserted Successfully");
			RequestDispatcher rd = req.getRequestDispatcher("AddEmp.jsp");
			rd.forward(req, res);
		}
	}
	
}
