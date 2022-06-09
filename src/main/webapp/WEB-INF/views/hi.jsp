<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>Hi page from views directory</b>
	
	<%
		String data2= (String)request.getAttribute("key2");
	%>
	
	<%= "Data2:="+data2%>
	
	
		<b>Printing data2 using SpEL: ${key2}</b>
	
</body>
</html>