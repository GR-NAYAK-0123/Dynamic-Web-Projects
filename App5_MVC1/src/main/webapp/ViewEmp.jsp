<%@page import="java.util.Iterator"%>
<%@page import="com.pack1.EmployeeBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <center>
    <%
       ArrayList<EmployeeBean> al = (ArrayList<EmployeeBean>)request.getAttribute("list");
       
       if(al.size() == 0){
    	   out.println("<h3>Database is Empty</h3>");
       }
       else{
    	   Iterator<EmployeeBean> i = al.iterator();
    	   while(i.hasNext()){
    		   EmployeeBean eb = i.next();
    		   out.println("<h3>");
    		   out.println(eb.getEmpId()+" "+eb.getEmpFName()+" "+eb.getEmpLName()+" "+eb.getEmpSal()+" "+eb.getEmpAdd()+"<br>");
    		   out.println("</h3>");
    		   
    	   }
       }
    %>
    
    <jsp:include page="index.html" />
</body>
</html>