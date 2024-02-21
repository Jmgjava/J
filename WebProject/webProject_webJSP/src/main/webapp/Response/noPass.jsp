<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int age = Integer.parseInt(request.getParameter("age"));
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pass</title>
</head>
<body>
	<h1>접속 불가능</h1>
	당신의 나이는 : <%= age %> 입니다.
	<a href="#">HOME</a>
</body>
</html>