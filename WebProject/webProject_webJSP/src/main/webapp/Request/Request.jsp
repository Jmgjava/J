<%@page import="java.util.ArrayList"%>
<%@page import="org.web.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
List<MemberDto> members = new ArrayList<MemberDto>();
members.add(new MemberDto("m1", "11", "01011112222"));
members.add(new MemberDto("m2", "12", "01022222222"));
members.add(new MemberDto("m3", "13", "01033332222"));
members.add(new MemberDto("m4", "14", "01044444422"));

request.setAttribute("members", members);

List<MemberDto> list = (List<MemberDto>)request.getAttribute("members");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request</title>
<style>
table, tr ,td {
border: 1px solid;
}
</style>
</head>
<body>

	<table>
	<tr>
	<th>아이디</th>
	<th>비밀번호</th>
	<th>전화번호</th>
	</tr>
	<%
	for(MemberDto member:list){
	%>
	<tr>
	<td><%= member.getUserId() %></td>
	<td><%= member.getUserPw() %></td>
	<td><%= member.getPhone() %></td>
	</tr>
<% 
	}
%>		
	</table>

</body>
</html>