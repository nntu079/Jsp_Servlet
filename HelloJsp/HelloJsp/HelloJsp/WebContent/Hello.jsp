<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p>Hello Jsp</p>

	<%
		int x = 10;
	int y = 5;
	int z = x + y;
	%>

	<%=z%>
	<br>

	<a href="User/Profile.jsp?id=1">Thong tin nguoi dung</a>

</body>
</html>