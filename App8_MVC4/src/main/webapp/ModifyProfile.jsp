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
         String name = (String) request.getAttribute("userName");
         Bean b = (Bean) application.getAttribute("bean");
         
         out.println("This session belongs to : "+name+"<br><br>");
         out.println("----Modify the Profile Details----<br><br>");
         %>
         <form action="modify" method="post">
         First Name : <input type="text" name="ufname" value="<%=b.getFirstName() %>"/> <br><br>
         Last Name : <input type="text" name="ulname" value="<%=b.getLastName() %>"/> <br><br>
         Mail Id : <input type="text" name="umail" value="<%=b.getMail() %>"/> <br><br>
          <input type="submit" value="Modify">
         </form>
    </h3>
</body>
</html>