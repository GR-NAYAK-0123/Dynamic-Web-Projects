package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fs")
public class FirstServlet extends GenericServlet{


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String name = req.getParameter("uname");
		String e_mail = req.getParameter("umail");
		
		pw.println("<center>");
		pw.println("--------Data From Html--------");
		pw.println("<br> UserName is : "+name);
		pw.println("<br> Mail_id : "+e_mail);
		pw.println("</center>");
	}
	
	
	
}
