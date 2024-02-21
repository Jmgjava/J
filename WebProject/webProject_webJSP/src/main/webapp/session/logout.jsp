<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>

    <%
    String sessionId = (String)session.getAttribute("sessionId");
    
    if(sessionId!=null){
    	// 로그인 상태
    	session.invalidate(); // 모든 세션 삭제
    	
    	
    	out.println("<script>");
    	
    	out.println("alert('로그아웃 되었습니다! index 페이지로 이동합니다.');");
    	out.println(" location.href='session_index.jsp'");
    	
    	out.println("</script>");
    	
    	/* response.sendRedirect("session_index.jsp"); */
    }else{
    	// 비로그인 상태
    	out.println("<script>");
    	
    	out.println("alert('접근권한 없음! index 페이지로 이동합니다.');");
    	out.println(" location.href='session_index.jsp'");
    	
    	out.println("</script>");
    	
    }
    
    %>
    
<%
/* if(request.isRequestedSessionIdValid()){
	session.invalidate(); // 모든 세션 삭제
} */
%>

</body>
</html>