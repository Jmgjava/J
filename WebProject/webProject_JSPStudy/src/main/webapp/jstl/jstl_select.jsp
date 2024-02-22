<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>
	<h1>조회</h1>
	<%-- 1. DB연동 --%>
	<sql:setDataSource var="dbConn" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/testdb" user="root" password="1234" />

	<%-- 조회 --%>
	<sql:query var="members" dataSource="${dbConn }">
		select * from jstl_tb
	</sql:query>

	<table border="1">
		<tr>
			<td>번호</td>
			<td>아이디</td>
			<td>비밀번호</td>
		</tr>
		<c:forEach var="member" items="${members.rows}">
			<tr>
				<td>${member.no }</td>
				<td>${member.userId }</td>
				<td>${member.userPw }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>