<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 조회</title>
</head>
<body>
	<%
	Cookie[] cookies = request.getCookies();

	for (Cookie i : cookies) {
		String name = i.getName();
		String value = i.getValue();

		if (name.equals("root")) {
			out.println("cookie name" + name + "</br>");
			out.println("cookie value" + value + "</br>");
		}
	}
	%>
	
	<h1>쿠키 조회</h1>
	<a href="cookie_del.jsp">쿠키삭제</a>
	<a href="cookie_test.jsp">쿠키확인</a>

</body>
</html>