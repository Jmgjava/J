<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String dbId = "m1";
String dbPw = "1111";
String userId = request.getParameter("userId");
String userPw = request.getParameter("userPw");

//로그인 성공
if (userId.equals(dbId) && userPw.equals(dbPw)) {
	session.setAttribute("sessionId", userId);
	session.setMaxInactiveInterval(60 * 60);

	out.println("<script>");
	out.println("alert('로그인 성공! session_index.jsp 이동합니다'); ");
	out.println(" location.href='session_index.jsp' ");
	out.println("</script>");
} else {
	// 로그인 실패 -> 팝업("로그인실패입니다! 로그인페이지로 이동합니다.")
	out.println("<script>");
	out.println("alert('로그인실패입니다! 로그인페이지로 이동합니다.'); ");
	out.println(" location.href='login.jsp' ");
	out.println("</script>");

}
%>