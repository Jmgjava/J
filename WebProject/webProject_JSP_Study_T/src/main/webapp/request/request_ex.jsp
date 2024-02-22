<%@page import="java.util.ArrayList"%>
<%@page import="org.web.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<MemberDto> members=new ArrayList<>();
	members.add(new MemberDto("m1","11","0100000000"));
	members.add(new MemberDto("m2","21","0100000000"));
	members.add(new MemberDto("m3","31","0100000000"));
	members.add(new MemberDto("m4","41","0100000000"));
	members.add(new MemberDto("m5","31","0100000000"));
	
	request.setAttribute("members", members);
	
	List<MemberDto> lists=(List<MemberDto>)request.getAttribute("members");

%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request</title>
</head>
<body>

<table border="1">
	<tr>
		<th>아이디</th>
		<th>비빌번호</th>
		<th>전화번호</th>
	</tr>	
	<%
		for(MemberDto member: lists){
			%>
			<tr>
				<td><%=member.getUserId() %></td>
				<td><%=member.getUserPw() %></td>
				<td><%=member.getPhone() %></td>
			</tr>
			<%
		}		
	%>		
</table>













</body>
</html>