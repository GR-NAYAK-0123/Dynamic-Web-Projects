package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cas")
public class CreateAccountServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Bean b = new Bean();
		
		b.setUserName(req.getParameter("uname"));
		b.setPassword(req.getParameter("upwd"));
		b.setFirstName(req.getParameter("ufname"));
		b.setLastName(req.getParameter("ulname"));
		b.setMail(req.getParameter("umail"));
		
		CreateAccountDAO createDAO = new CreateAccountDAO();
		int rowCount = createDAO.insert(b);
		
		RequestDispatcher rd = req.getRequestDispatcher("Create.jsp");
		
		if(rowCount > 0) {
			req.setAttribute("msg", "Account Created Successfully !!");
			rd.forward(req, res);
		}
		else {
			req.setAttribute("msg", "Account Creation Failed");
			rd.forward(req, res);
		}
	}
}
