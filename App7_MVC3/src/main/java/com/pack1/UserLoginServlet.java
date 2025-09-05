package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class UserLoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		UserLoginDAO uDAO = new UserLoginDAO();
		
		UserBean ub = uDAO.retrieve(req.getParameter("uname"), req.getParameter("upwd"));
		
		if(ub == null) {
			req.setAttribute("msg", "Invalid Credentials!!");
			RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}
		else {
			ServletContext context = req.getServletContext();
			context.setAttribute("bean", ub);
			Cookie c = new Cookie("cName", ub.getUserName());
			res.addCookie(c);
			RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
			rd.forward(req, res);
		}
	}
}
