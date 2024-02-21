<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pageContext</title>
</head>
<body>
 request 기본 객체를 반환 -> <%=pageContext.getRequest() %> <br />
 response 기본 객체를 반환 -> <%=pageContext.getResponse() %> <br />
 session 기본 객체를 반환 -> <%=pageContext.getSession() %> <br />
 application 기본 객체를 반환 -> <%=pageContext.getServletContext() %> <br />
 config 기본 객체를 반환 -> <%=pageContext.getServletConfig() %> <br />
 out 기본 객체를 반환 -> <%=pageContext.getOut() %> <br />
 exception 기본 객체를 반환 -> <%=pageContext.getException() %> <br />
 page 기본 객체를 반환 -> <%=pageContext.getPage() %> <br />
</body>
</html>