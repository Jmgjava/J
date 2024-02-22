<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<!-- 자바빈 선언 -->
<jsp:useBean id="memberBean" class="org.web.javabean.MemberBean" scope="page" />
<!-- 자바빈 필드 set -->
<jsp:setProperty property="userId" name="memberBean" value="m1"/>
<jsp:setProperty property="userPw" name="memberBean" value="11"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>useBean</title>
</head>
<body>
	<h1>자바빈 get</h1>
Id:	<jsp:getProperty name="memberBean" property="userId"/> <br />
Pw:	<jsp:getProperty name="memberBean" property="userPw"/> <br />
	
	
	<%
	memberBean.setUserId("m1");
	memberBean.setUserPw("11");
	%>
	
	id: <%= memberBean.getUserId() %> <br />
	pw: <%= memberBean.getUserPw() %> <br />


</body>
</html>