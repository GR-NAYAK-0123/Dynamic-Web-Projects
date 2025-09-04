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
    <h2>
    <%
        String data = (String)request.getAttribute("msg");
        out.println(data);
        out.println("<br><br>");
    %>
    <a href="AddProduct.html">Add Product</a> <br><br>
    <a href="View">View Product</a>
    </h2>
</body>
</html>