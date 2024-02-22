<%@page import="java.util.List"%>
<%@page import="org.web.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
List<MemberDto> members =(List<MemberDto>) request.getAttribute("members");
%>


<div class="container">

	<div class="memberList">
		<div class="memberList-con">
			<h1>회원목록</h1>
			<table border="1">
				<tr>
					<td>번호</td>
					<td>아이디</td>
					<td>비번</td>
					<td>성별</td>
					<td>취미</td>
					<td>정보</td>
				</tr>
				<%
				for (MemberDto i : members){
					%>
					<tr>
					<td><%=i.getNo() %></td>
					<td><%=i.getUserId() %></td>
					<td><%=i.getUserPw() %></td>
					<td><%=i.getGender() %></td>
					<td><%=i.getHobby() %></td>
					<td><%=i.getMemo() %></td>
					</tr>
					
					
				<%
				}
				%>
			</table>

		</div>
	</div>

</div>
