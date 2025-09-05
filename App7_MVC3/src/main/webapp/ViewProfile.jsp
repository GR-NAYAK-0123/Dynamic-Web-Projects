<%@page import="com.pack1.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h3>
     <center>
         <%
            String name = (String)request.getAttribute("uname");
            UserBean ub = (UserBean)application.getAttribute("bean");
            
            out.println("This Session belongs to "+name+"<br><br>");
            out.println("----------Profile Details------------<br><br>");
            out.println(ub.getUserName()+"<br><br>");
            out.println(ub.getFirstName()+"<br><br>");
            out.println(ub.getLstName()+"<br><br>");
            out.println(ub.getMailId()+"<br><br>");
            out.println(ub.getPhone()+"<br><br>");
         %>
         <a href="edit">Edit Details</a> <br><br>
         <a href="logout">Logout</a>
    </h3>
</body>
</html>