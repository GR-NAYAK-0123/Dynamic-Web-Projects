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
           String name = (String) request.getAttribute("uname");
           UserBean ub = (UserBean) application.getAttribute("bean");
           
           out.println("This Session belongs to "+name+"<br><br>");
           out.println("-----Edit Profile Details------<br><br>");
           %>
           
           <form action="update" method="post">
                First Name : <input type="text" name=ufname value="<%=ub.getFirstName() %>"/> <br><br>
                Last Name : <input type="text" name=ulname value="<%=ub.getLstName() %>"/> <br><br>
                Mail Id : <input type="text" name=umail value="<%=ub.getMailId() %>"/> <br><br>
                Phone No : <input type="text" name=uphone value="<%=ub.getPhone() %>"/> <br><br>
                   <input type="submit" value="Update">
           </form>
     </h3>
</body>
</html>