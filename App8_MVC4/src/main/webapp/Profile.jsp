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
          Bean b = (Bean) application.getAttribute("bean");
          out.println("Welcome : "+b.getUserName()+"<br><br>");
          %>
          <a href="ViewProfile">View Profile</a><br><br>
          <a href="LogoutProfile">Logout</a><br><br>
     </h3>
</body>
</html>