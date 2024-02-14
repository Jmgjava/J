<%@page import="org.web.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 조회</title>
</head>
<body>
	<h1>회원 조회</h1>
	<%
	List<MemberDto> member = (List<MemberDto>) request.getAttribute("member");
	if (member != null) {
		for (MemberDto members : member) {
	%>
	<div>
		이름:
		<%=members.getNo()%>
		, 아이디 :
		<%=members.getUserId()%>
		, 비밀번호 :
		<%=members.getUserPw()%>
		, 이름 :
		<%=members.getUserName()%>
	</div>
	<%
	}
	} else {
	%>
	<h1>조회할 회원이 없습니다</h1>
	<%
	}
	%>
</body>
</html>