package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ModifyProfile")
public class ModifyProfileServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Cookie arr[] = req.getCookies();
		String userName = null;
		
		if(arr == null) {
			req.setAttribute("msg", "Session Expired");
			RequestDispatcher rd = req.getRequestDispatcher("Create.jsp");
			rd.forward(req, res);
		}
		else {
			for(Cookie c : arr) {
				if("cName".equals(c.getName())) {
					userName = c.getValue();
				}
			}
			req.setAttribute("userName", userName);
			RequestDispatcher rd = req.getRequestDispatcher("ModifyProfile.jsp");
			rd.forward(req, res);
		}
	}
}
