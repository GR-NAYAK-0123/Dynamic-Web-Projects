package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/mds")
public class MyDetailServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String name = req.getParameter("mname");
		int age = Integer.parseInt(req.getParameter("mage"));
		String dept = req.getParameter("mdept");
		Float salary = Float.parseFloat(req.getParameter("msal"));
		String region = req.getParameter("mregion");
		String language = req.getParameter("mlang");
		
		pw.println("<center><h3>");
		pw.println("-------My Details-------");
		pw.println("<br>Name : "+name);
		pw.println("<br>Age : "+age);
		pw.println("<br>Dept : "+dept);
		pw.println("<br>Salary : "+salary);
		pw.println("<br>Region : "+region);
		pw.println("<br>Language : "+language);
		pw.println("<center><h3>");
	}
	
}
