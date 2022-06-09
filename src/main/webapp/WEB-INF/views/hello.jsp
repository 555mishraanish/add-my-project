<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>Hello page from views directory</b>
	
	<%
		String data1= (String)request.getAttribute("key1");
	%>
	
	<%= "Data1:="+data1%>
	
	
	<b>Printing data1 using SpEL: ${key1}</b>
	
	
</body>
</html>