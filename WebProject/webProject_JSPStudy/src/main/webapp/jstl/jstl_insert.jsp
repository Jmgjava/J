<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>
<%-- 1. 드라이버, DB연동 --%>
<sql:setDataSource 
var="dbConn"
driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3306/testdb"
user="root"
password="1234"
/>

<%-- 데이터 추가 --%>
<sql:update var="result" dataSource="${dbConn}">

insert into jstl_tb(userId,userPw) values(?,?);
<sql:param value="m4"/>
<sql:param value="14"/>
</sql:update>

<c:choose>
<c:when test="${result eq 1 }">
	회원가입 성공
</c:when>
<c:otherwise>
	회원가입 실패
</c:otherwise>
</c:choose>

<jsp:forward page="jstl_select.jsp"></jsp:forward>


</body>
</html>