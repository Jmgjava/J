<%@page import="java.util.ArrayList"%>
<%@page import="org.web.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>
	<%!int num1 = 10;%>
	num1: <%=num1%> <br />
	<h1>변수 선언, 초기화</h1>
	<c:set var="num2" value="100" /> <%-- 변수를 num2로 선언, 100으로 초기화 --%>
	num2: <c:out value="${num2}" /> <br /> <%--value="${변수명}"  --%>
	num1: <c:out value="${num1}"/> <br /><%-- jstl설정 변수만 출력가능 --%>
	<h1>변수 삭제</h1>
	<c:remove var="num2"/> <br /> <%-- 변수 삭제 --%>
	num2: <c:out value="${num2}" /> <br /> <%-- ${변수명} --%>
	
	<% out.println("안녕하세요"); %>
	<c:out value="안녕하세요"/> <%-- 문자열만 출력 --%>
	
	<h1>반복문</h1>
	
	<%
	for(int i=0;i<10;i++){
		out.print(i);
	}
	%>
	<br />
	<c:forEach var="i" begin="0" end="10" step="1" varStatus="status">
	변수: <c:out value="${i}" />, ${status.count } , ${status.index } <br />
	</c:forEach>
	
	<c:forEach var="i" begin="0" end="10" step="1" varStatus="status">
	변수: <c:out value="${i}" /> <br />
	<c:set var="sum" value="${sum+i}" />
	</c:forEach>
	<br />
	0부터 10까지 합 -> <c:out value="${sum}"/>
	
	<%
	// Service <-> dao <- DB 테이블 데이터 get
	List<MemberDto> members = new ArrayList<MemberDto>();
	members.add(new MemberDto("m1","11","01000000000"));
	members.add(new MemberDto("m2","12","01000000000"));
	members.add(new MemberDto("m3","13","01000000000"));
	members.add(new MemberDto("m4","14","01000000000"));
	
	request.setAttribute("members", members); // service
	%>
	<h1>회원목록</h1>
	<table border="1">
	<thead>
	<tr>
	<td>id</td>
	<td>pw</td>
	<td>phone</td>
	</tr>
	</thead>
	<tbody>
	<%
	for(MemberDto member : members){
		%>
		<tr>
		<td><%=member.getUserId() %></td>
		<td><%=member.getUserPw() %></td>
		<td><%=member.getPhone() %></td>
		</tr>
	<%
	}
	%>
	</tbody>
	</table>
	
	<h1>회원목록2</h1>
	<table border="1">
	<thead>
	<tr>
	<td>id</td>
	<td>pw</td>
	<td>phone</td>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="member" items="${members}">
	<tr>
	<td>${member.userId}</td>
	<td>${member.userPw}</td>
	<td>${member.phone}</td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
	
</body>
</html>