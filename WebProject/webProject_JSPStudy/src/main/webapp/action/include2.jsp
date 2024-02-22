<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
h1 {
	background-color: ##0000ff;
}
</style>
</head>
<body>
	<%@include file="include1.jsp"%>
	<jsp:include page="include1.jsp" flush="true" />
	<jsp:include page="include1.jsp" flush="true">
	<jsp:param value="userId" name="11111"/>

	<h1>include2.jsp</h1>
</body>
</html>