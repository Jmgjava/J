<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 자바빈 선언 -->
<jsp:useBean id="memberBean" class="org.web.javabean.MemberBean" scope="page" >
<!-- 자바빈 필드 set -->
<jsp:setProperty property="userId" name="memberBean" param="userId"/>
<jsp:setProperty property="userPw" name="memberBean" param="userPw"/>
</jsp:useBean>

id: <jsp:getProperty property="memberBean" name="userId"/> <br />
pw: <jsp:getProperty property="memberBean" name="userPw"/> <br />


</body>
</html>