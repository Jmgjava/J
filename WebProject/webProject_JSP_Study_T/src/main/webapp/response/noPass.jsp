<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int age= Integer.parseInt(request.getParameter("age"));	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>접속불가능합니다.</h1>
	당신의 나이는 : <%=age %>입니다. <br />
	<a href="#">HOME</a>
</body>
</html>