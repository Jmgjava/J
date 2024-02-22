<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String sessionId=(String)session.getAttribute("sessionId");

if(sessionId!=null){
	session.invalidate();//모든 세션 삭제	
	out.println("<script>");
	out.println("alert('로그아웃 되었습니다! session_index.jsp 이동합니다'); ");
	out.println(" location.href='session_index.jsp' ");		
	out.println("</script>");
}else{
	out.println("<script>");
	out.println("alert('접근권한없습니다! session_index.jsp 이동합니다'); ");
	out.println(" location.href='session_index.jsp' ");		
	out.println("</script>");
}

/* if(request.isRequestedSessionIdValid()){
	session.invalidate();//모든 세션 삭제
} */

%>
