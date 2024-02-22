<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie삭제</title>
</head>
<body>
<%
 Cookie[] cookies=request.getCookies();
	
	for(Cookie cookie: cookies){		
		
		 String name=cookie.getName();
		 String value=cookie.getValue();		 
		 if(name.equals("root")){
			cookie.setMaxAge(0);// 쿠키 삭제
			response.addCookie(cookie);
		 }		
	}
%>
<a href="cookie_test.jsp">쿠키확인</a>
</body>
</html>