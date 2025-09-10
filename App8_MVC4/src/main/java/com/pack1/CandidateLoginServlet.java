package com.pack1;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ln")
public class CandidateLoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		
		CandidateLoginDAO loginDAO = new CandidateLoginDAO();
		
		Bean b = loginDAO.retrieve(req.getParameter("uname"), req.getParameter("upwd"));
		
		if(b == null) {
			req.setAttribute("msg", "Invalid Credential !!!");
			RequestDispatcher rd = req.getRequestDispatcher("Create.jsp");
			rd.forward(req, res);
		}
		else {
			ServletContext context = req.getServletContext();
			context.setAttribute("bean", b);
			Cookie c = new Cookie("cName", b.getUserName());
			res.addCookie(c);
			RequestDispatcher rd = req.getRequestDispatcher("Profile.jsp");
			rd.forward(req, res);
		}
	}
}
