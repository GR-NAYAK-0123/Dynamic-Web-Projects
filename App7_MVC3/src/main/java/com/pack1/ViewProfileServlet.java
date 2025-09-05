package com.pack1;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie arr[] = req.getCookies();
		String uname = null;
		
		if(arr == null) {
			req.setAttribute("msg", "Session Expired!!");
			RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}
		else {
			for(Cookie ck : arr) {
				if("cName".equals(ck.getName())) {
					uname = ck.getValue();
				}
				req.setAttribute("uname", uname);
				RequestDispatcher rd = req.getRequestDispatcher("ViewProfile.jsp");
				rd.forward(req, res);
			}
		}
	}
}
