<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include2</title>
<style>
	h1{
		background-color: #0000ff;
	}
</style>
</head>
<body>
<%-- <%@ include file="include1.jsp" %> --%>
<%-- <jsp:include page="include1.jsp" ></jsp:include> --%>
<jsp:include page="include1.jsp" flush="true" />
<jsp:include page="include1.jsp" flush="true">
	<jsp:param  name="userId" value="11111"/>
</jsp:include>
<h1>include2.jsp</h1>
</body>
</html>