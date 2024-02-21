<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
 String sessionId = (String) session.getAttribute("sessionId");
%>


<div class="header">
	<ul>
		<li><a href="session_index.jsp">HTML</a></li>
		<%
		if (sessionId != null) {
		%>
		<li><a href="logout.jsp">Logout</a></li>
		<li><%=sessionId %> 고객님</li>
		<%
		} else {
		%>
		<li><a href="login.jsp">Login</a></li>
		<%
		}
		%>
		<li><a href="">HTML</a></li>
	</ul>
</div>