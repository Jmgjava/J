<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 자바빈 선언 --%>
<jsp:useBean id="memberBean" class="org.web.javabean.MemberBean" scope="page">
	<jsp:setProperty  name="memberBean" property="userId" param="userId" />
	<jsp:setProperty  name="memberBean" property="userPw" value="userPw"/>
</jsp:useBean>  

id: <jsp:getProperty  name="memberBean" property="userId"/> <br />
pw: <jsp:getProperty  name="memberBean" property="userPw"/> <br />

</body>
</html>