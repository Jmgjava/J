<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    session="true"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session</title>
</head>
<body>
<%
	//세션 초기호            //세션ID, 세션값
	session.setAttribute("admin", "admin_1234");
	session.setAttribute("member", "member_1234");
	session.setAttribute("editor", "editor_1234");
%>
<div> <a href="sessionget.jsp"> sessionget.jsp이동 </a></div>

<div>세션1 : <%=session.getAttribute("admin") %></div>
<div>세션2 : <%=session.getAttribute("member") %></div>
<div>세션3 : <%=session.getAttribute("editor") %></div>


</body>
</html>