<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%
       String name = request.getParameter("pName");
       String id = request.getParameter("pId");
       String quantity = request.getParameter("pQty");
       String price = request.getParameter("pPrice");
       
       out.println("<center><h2>");
       out.println("<marquee>Product Details</marquee>");
       out.println("<br><br>Product Name : "+name);
       out.println("<br><br>Product Id : "+id);
       out.println("<br><br>Product Quantity : "+quantity);
       out.println("<br><br>Product Price : "+price);
       out.println("</center></h2>");
   %>
</body>
</html>