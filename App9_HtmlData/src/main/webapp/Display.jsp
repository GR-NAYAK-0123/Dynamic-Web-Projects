<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.util.Arrays"%>
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
      String name = request.getParameter("tname");
      String age = request.getParameter("tage");
      String gender = request.getParameter("gen");
      String address = request.getParameter("taddress");
      String maritalStatus = request.getParameter("ms");
      String qualification = request.getParameter("qlfy");
      String courses = request.getParameter("crs");
      String hobbies[] = request.getParameterValues("hb");
      
      out.println("Name : "+name+"<br>");
      out.println("Age : "+age+"<br>");
      out.println("Gender : "+gender+"<br>");
      out.println("Address : "+address+"<br>");
      out.println("MaritalStatus : "+maritalStatus+"<br>");
      out.println("Qualification : "+qualification+"<br>");
      out.println("Courses : "+courses+"<br>");
      out.println("Hobbies : "+Arrays.toString(hobbies)+"<br>");
      out.println("Java : "+request.getParameter("msg")+"<br>");
      %>
      
    </h3>
</body>
</html>