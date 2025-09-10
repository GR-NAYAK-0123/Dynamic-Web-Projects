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
         String data = (String)request.getAttribute("msg");
         String userName = (String)request.getAttribute("userName");
         
         out.println("The Session belongs to : "+userName+"<br><br>");
         out.println(data+"<br><br>");
         %>
         <a href="ViewProfile">View Profile</a><br><br>
         <a href="LogoutProfile">Logout</a>
    </h3>
</body>
</html>