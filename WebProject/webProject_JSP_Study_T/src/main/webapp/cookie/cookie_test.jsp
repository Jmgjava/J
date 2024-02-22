<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie확인</title>
</head>
<body>
<%
	Cookie[] cookies=request.getCookies();
	if(cookies!=null){
		for(Cookie cookie: cookies){
		out.println("쿠키이름: "+cookie.getName()+"<br>");
		out.println("쿠키값: "+cookie.getValue()+"<br>");			
		}		
	}else{
		out.println("쿠키가 존재하지 않습니다.");
	}

%>
<a href="cookie_set.jsp">쿠키생성</a>
</body>
</html>