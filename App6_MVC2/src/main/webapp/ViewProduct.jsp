<%@page import="java.util.Iterator"%>
<%@page import="com.pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
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
         ArrayList<ProductBean> al = (ArrayList<ProductBean>)request.getAttribute("list");
         
         if(al.size() == 0){
        	 out.println("Empty Database");
         }
         else{
        	 Iterator<ProductBean> i = al.iterator();
        	 while(i.hasNext()){
        		 ProductBean pb = i.next();
        		 
        		 out.println(pb.getProductCode()+" "+pb.getProductName()+" "+pb.getProductCompany()+" "+pb.getProductPrice()+" "+pb.getProductQty()+"<br><br>");
        	 }
         }
       %>
       
       <jsp:include page="index.html" />
       </h2>
</body>
</html>