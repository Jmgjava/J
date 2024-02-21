<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String userId=request.getParameter("userId");
String userPw=request.getParameter("userPW");

// JSP <- Controller <- Servlet <- dao
request.setAttribute("id", userId);
%>

id: <%= userId %> <br />
pw: <%= userPw %> <br />

<h1>EL param</h1>
id: ${param.userId} <br />
pw: ${param.userPw} <br />

</body>
</html>