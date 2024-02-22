<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
if (session.getAttribute("sessionId") != null) {
	
	out.println("<script>");
	out.println("alert('이미 로그인 되어있습니다! index 페이지로 이동합니다.');");
	out.println(" location.href='session_index.jsp'");
	out.println("</script>");

	/* response.sendRedirect("session_index.jsp"); */
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	<%@ include file="header.jsp"%>

	<h1>로그인</h1>
	<form action="LoginOk.jsp" method="POST">
		ID: <input type="text" name="userId" id="userId" /> <br /> Pw: <input
			type="password" name="userPw" id="userPw" /> <br /> <input
			type="submit" value="로그인" />
	</form>

</body>
</html>