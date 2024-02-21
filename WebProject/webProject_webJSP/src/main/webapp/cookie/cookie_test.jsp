<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 확인</title>
</head>
<body>
	<%
	Cookie[] cookies = request.getCookies();

	if (cookies != null) {
		for (Cookie i : cookies) {
			out.println("쿠키이름: " + i.getName());
			out.println("쿠키값: " + i.getValue());
		}

	} else {
		out.println("쿠키가 존재하지 않습니다.");
	}
	%>

</body>
</html>