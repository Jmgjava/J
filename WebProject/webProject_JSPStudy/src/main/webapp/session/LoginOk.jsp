<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("UTF-8");

String dbId="m1";
String dbPw="11";
String userId =request.getParameter("userId");
String userPw =request.getParameter("userPw");

if(userId.equals(dbId) && userPw.equals(dbPw)){
	session.setAttribute("sessionId", userId);
	session.setMaxInactiveInterval(60*60);
	
	out.println("<script>");
	
	out.println("alert('로그인성공');");
	out.println(" location.href='session_index.jsp'");
	
	out.println("</script>");
}else{
	out.println("<script>");
	
	out.println("alert('로그인실패. 다시 로그인하세요');");
	out.println(" location.href='login.jsp'");
	
	out.println("</script>");
}
%>

