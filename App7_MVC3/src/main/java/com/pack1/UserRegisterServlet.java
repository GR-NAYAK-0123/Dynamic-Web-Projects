package com.pack1;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class UserRegisterServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		UserBean ub = new UserBean();
		
		ub.setUserName(req.getParameter("uname"));
		ub.setPassword(req.getParameter("upwd"));
		ub.setFirstName(req.getParameter("ufname"));
		ub.setLastName(req.getParameter("ulname"));
		ub.setMailId(req.getParameter("umid"));
		ub.setPhone(req.getParameter("uphone"));
		
		UserRegistrationDAO urd = new UserRegistrationDAO();
		int rowCount = urd.register(ub);
		
		if(rowCount > 0) {
			req.setAttribute("msg", "User Registered Successfully");
			RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}
		else {
			req.setAttribute("msg", "Registration Failed");
			RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}
	}
}
