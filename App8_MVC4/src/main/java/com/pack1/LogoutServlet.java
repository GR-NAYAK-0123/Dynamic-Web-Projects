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

@WebServlet("/LogoutProfile")
public class LogoutServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Cookie arr[] = req.getCookies();
		
		if(arr == null) {
			req.setAttribute("msg", "Session Expired");
			RequestDispatcher rd = req.getRequestDispatcher("Create.jsp");
			rd.forward(req, res);
		}
		else {
			ServletContext context = req.getServletContext();
			context.removeAttribute("bean");
			
			arr[0].setMaxAge(0);
			res.addCookie(arr[0]);
			
			req.setAttribute("msg", "Logout Successfully");
			RequestDispatcher rd = req.getRequestDispatcher("Create.jsp");
			rd.forward(req, res);
		}
	}
}
