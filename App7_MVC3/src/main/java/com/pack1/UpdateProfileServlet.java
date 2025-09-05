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

@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie arr[] = req.getCookies();
		String uname = null;
		
		if(arr == null) {
			req.setAttribute("msg", "Session Expired");
			RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
			rd.forward(req, res);
		}
		else {
			ServletContext context = req.getServletContext();
			UserBean ub = (UserBean) context.getAttribute("bean");
			UpdateProfileDAO updateDAO = new UpdateProfileDAO();
			
			ub.setFirstName(req.getParameter("ufname"));
			ub.setLastName(req.getParameter("ulname"));
			ub.setMailId(req.getParameter("umail"));
			ub.setPhone(req.getParameter("uphone"));
			
			int rowCount = updateDAO.update(ub);
			
			if(rowCount > 0)
				req.setAttribute("msg", "Data Updated!!");
				
			for(Cookie ck : arr) {
				if("cName".equals(ck.getName())) {
					uname = ck.getValue();
				}
				req.setAttribute("uname", uname);
				RequestDispatcher rd = req.getRequestDispatcher("UpdateProfile.jsp");
				rd.forward(req, res);
			}
			
		}
	}
}
