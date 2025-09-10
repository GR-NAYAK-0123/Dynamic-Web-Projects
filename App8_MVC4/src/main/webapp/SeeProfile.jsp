<%@page import="com.pack1.Bean"%>
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
        String name = (String)request.getAttribute("userName");
        Bean b = (Bean) application.getAttribute("bean");
        out.println("This Session is belongs to : "+name+"<br><br>");
        out.println("---------Profile Details----------<br><br>");
        out.println("User Name : "+b.getUserName()+"<br><br>");
        out.println("First Name : "+b.getFirstName()+"<br><br>");
        out.println("Last Name : "+b.getLastName()+"<br><br>");
        out.println("Mail Id : "+b.getMail()+"<br><br>");
        %>
        <a href="ModifyProfile">Modify Profile</a><br><br>
        <a href="LogoutProfile">Logout</a>
   </h3>
</body>
</html>