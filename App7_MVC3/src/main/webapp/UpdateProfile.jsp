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
        String uname = (String) request.getAttribute("uname");
        String data = (String) request.getAttribute("msg");
        
        out.println("This Session belongs to "+uname+"<br><br>");
        out.println(data+"<br><br>");
        %>
        
        <a href="view">View Profile</a> <br><br>
        <a href="logout">Logout</a>
   </h3>
</body>
</html>