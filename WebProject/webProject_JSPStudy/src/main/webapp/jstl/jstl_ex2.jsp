<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>
<h1>if</h1>

<%-- 조건이하나일 때 --%>

<%
String name2 = "java";
if(name2.equals("java")){
	out.println("자바가 맞습니다.");
}
%>
<br />

<c:set var="name" value="java" />
<c:if test="${name eq 'java'}" >
<%-- 조건(test)이 true 이면 실행 --%>
<c:out value="자바가 맞습니다."/>
</c:if>
<br />

<h1>조건이 1개</h1>

<c:set var="name" value="java" />
<c:if test="${name eq 'java'}" >
<c:out value="자바가 맞습니다."/>
</c:if> <br />

<c:if test="${name ne 'java'}" >
<c:out value="자바가 아닙니다."/>
</c:if> <br />

<c:if test="${empty name}" >
<c:out value="값이 없습니다."/>
</c:if> <br />

<c:if test="${not empty name}" >
<c:out value="값이 존재합니다."/>
</c:if> <br />

<h1>조건이 2개</h1>
<c:set var="userId" value="m1"/>
<c:set var="userPw" value="11"/>


	<%-- 로그인 성공 --%>
<c:if test="${ (userId eq 'm1') and (userPw eq '11') }" >
	<c:out value="아이디와 비밀번호가 일치합니다."/> <br />
</c:if>

<c:if test="${ (userId eq 'm1') or (userPw eq '11') }" >
	<c:out value="아이디 또는 비밀번호가 일치합니다."/> <br />
</c:if>

	<%-- 로그인 실패 --%>
<c:if test="${ (userId ne 'm1') or (userPw ne '11') }" >
	<c:out value="아이디 또는 비밀번호가 틀렸습니다."/> <br />
</c:if>

<%-- null --%>
<c:if test="${userId eq null}" >
	<c:out value="null 값입니다(존재하지않습니다.)"/> <br />
</c:if>

<h3>다중 조건문 choose-when~otherwise(if-else)</h3>
<c:set var="id" value="m1" />
<c:set var="pw" value="11" />
<c:choose>
	<c:when test="${(id eq 'm1') and (pw eq '11') }">
	<c:out value="로그인 성공"/>
	</c:when>
	<c:otherwise>
		<c:out value="로그인 실패"></c:out>
	</c:otherwise>
</c:choose>

</body>
</html>