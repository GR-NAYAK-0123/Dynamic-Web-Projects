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
       String msg = (String)application.getAttribute("msg");
       String context_param = application.getInitParameter("msg2");
       String s_Name = (String)request.getAttribute("ServletName");
       String config_param = (String)request.getAttribute("msg3");
       
       out.println("Hello Mr."+request.getParameter("uname")+"<br><br>");
       out.println("Context : "+msg+"(From the servlet)<br><br>");
       out.println("Context_param : "+context_param+"(From the web.xml)<br><br>");
       out.println("Server  : "+application.getServerInfo()+"<br><br>");
       out.println("config Data ServletName : "+s_Name+"(From config)<br><br>");
       out.println("config_param : "+config_param+"(From the web.xml)<br><br>");
       %>
   </h3>
</body>
</html>