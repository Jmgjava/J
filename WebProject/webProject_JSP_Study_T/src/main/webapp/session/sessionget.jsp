<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session</title>
</head>
<body>
<%
	String sessionId1=(String)session.getAttribute("admin");
	String sessionId2=(String)session.getAttribute("member");
	String sessionId3=(String)session.getAttribute("editor");
	
	// 모든 세션의 이름
	Enumeration en= session.getAttributeNames();
	while(en.hasMoreElements()){
		String sessionId=en.nextElement().toString();
		String sessionVal=session.getAttribute(sessionId).toString();
		out.print("세션이름: "+sessionId+", 세션값: "+sessionVal+"<br>");
	}
	
	
%>
세션1: <%=sessionId1 %> <br />
세션2: <%=sessionId2 %> <br />
세션3: <%=sessionId3 %> <br />

<%
//모든 세션의 이름
	Enumeration en1= session.getAttributeNames();
	while(en1.hasMoreElements()){
		String sessionId=en1.nextElement().toString();
		String sessionVal=session.getAttribute(sessionId).toString();
		%>
		세션이름:<%=sessionId %>, 세션값: <%=sessionVal %>  <br>		
		<%
	}		
	int time=session.getMaxInactiveInterval();
%>
세션 시간 <%=time %> <br />
<%
	session.setMaxInactiveInterval(60*60);
	int time2=session.getMaxInactiveInterval();
%>
세션 시간 <%=time2 %> <br />

<%

	if(request.isRequestedSessionIdValid()){
		out.println("session valid");
	}else{		
		out.println("session inValid");
	}

%>

<h1>로그아웃</h1>
<%
	session.invalidate();//모든 세션 삭제
	
	if(request.isRequestedSessionIdValid()){
		out.println("session valid");
		session.invalidate();//모든 세션 삭제
	}else{		
		out.println("session inValid");
	}

%>

</body>
</html>