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

@WebServlet("/modify")
public class ModifyingProfileServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Cookie arr[] = req.getCookies();
		String userName = null;
		
		if(arr == null) {
			req.setAttribute("msg", "Session Expired");
			RequestDispatcher rd = req.getRequestDispatcher("Created.jsp");
			rd.forward(req, res);
		}
		else {
			ServletContext context = req.getServletContext();
			Bean b = (Bean) context.getAttribute("bean");
			ModifyingProfileDAO modifyingDAO = new ModifyingProfileDAO();
			
			b.setFirstName(req.getParameter("ufname"));
			b.setLastName(req.getParameter("ulname"));
			b.setMail(req.getParameter("umail"));
			
			int rowCount = modifyingDAO.modify(b);
			
			if(rowCount > 0)
				req.setAttribute("msg", "Profile Modified Successfully");
			
			for(Cookie c : arr) {
				if("cName".equals(c.getName())) {
					userName = c.getValue();
				}
			}
			req.setAttribute("userName", userName);
			RequestDispatcher rd = req.getRequestDispatcher("ModifiedProfile.jsp");
			rd.forward(req, res);
		}
	}
}
