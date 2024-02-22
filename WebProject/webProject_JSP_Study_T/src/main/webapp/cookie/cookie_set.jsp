<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie_set</title>
</head>
<body>

<%
	Cookie cookie= new Cookie("root","1111");
	cookie.setMaxAge(60*60);// 1시간
	response.addCookie(cookie);// cookie추가
%>
<h>쿠키생성</h>
<a href="cookie_get.jsp">cookie_get</a>
<a href="cookie_test.jsp">쿠키확인</a>





</body>
</html>