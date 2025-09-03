package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/es")
public class EmployeeServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String name = req.getParameter("ename");
		String dept = req.getParameter("edept");
		int exp = Integer.parseInt(req.getParameter("eexp"));
		int salary = Integer.parseInt(req.getParameter("esal"));
		
		pw.println("<center>");
		pw.println("--------Employee Data-------");
		pw.println("<br>Employee Name : "+name);
		pw.println("<br>Employee Dept : "+dept);
		pw.println("<br>Employee Exp : "+exp);
		if(exp >= 5) {
			int updateSal = salary + (int)(0.1 * salary);
			pw.println("<br>Employee Salary : "+salary);
			pw.println("<br>Employee Update Salary : "+updateSal);
			pw.println("<center>");
		}
		else {
			pw.println("<br>Employee Salary : "+salary);
			pw.println("<center>");
		}
				
	}
	
}
