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
              UserBean ub = (UserBean) application.getAttribute("bean");
              out.println("Welcome : "+ub.getUserName()+"<br><br>");
          %>
          <a href="view">View Profile</a> <br><br>
          <a href="logout">Logout</a> <br><br>
     </h3>
</body>
</html>