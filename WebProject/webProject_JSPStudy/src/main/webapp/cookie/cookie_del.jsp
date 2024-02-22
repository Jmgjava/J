<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키삭제</title>
</head>
<body>
	<%
	Cookie[] cookies = request.getCookies();

	for (Cookie i : cookies) {
		String name = i.getName();
		String value = i.getValue();

		if (name.equals("root")) {
			i.setMaxAge(0); //쿠키 삭제
			response.addCookie(i);
		}
	}
	%>

</body>
</html>