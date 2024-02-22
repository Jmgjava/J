<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sessionId=(String)session.getAttribute("sessionId");
	
	if(sessionId!=null){
		out.println("<script>");
		out.println("alert('이미 로그인 되었습니다! session_index.jsp 이동합니다'); ");
		out.println(" location.href='session_index.jsp' ");		
		out.println("</script>");
		//response.sendRedirect("session_index.jsp");
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인페이지</title>
</head>
<body>

<h1>로그인</h1>
<form action="loginOk.jsp" method="POST">
	ID: <input type="text" name="userId" id="userId" /> <br />
	PW: <input type="password" name="userPw" id="userPw" /> <br />
	<input type="submit" value="로그인실행" />
</form>

</body>
</html>