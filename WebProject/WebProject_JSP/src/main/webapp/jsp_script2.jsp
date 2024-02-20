<%@page import="org.web.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Script</title>
<style>
	table, tr, td{
border: 1px solid #000000;
border-collapse: collapse;
}
</style>
</head>
<body>
	<%!// 메소드 변수 선언
	public int sum(int num1, int num2) {
		int num3 = num1 + num2;
		return num3;
	}%>

	100+200=
	<%=sum(100, 200)%>
	<br />

	<%
	// 외부 데이터, 반복문, 조건문 처리,,,,
	List<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);

	for (Integer i : list) {
		out.println("<h4>" + i + "</h4>"); // html 코드 " 작성"
	}
	%>

	<%
	// 반복문 -> 자바+HTML
	for (Integer i : list) {
	%>
	<h4><%=i%></h4>
	<%
	}
	%>

	<%
	MemberDto member = new MemberDto(1, "m1", "11", "남", "등반", "010-0000-0000", "서울", "정보");
	%>

	<%-- JSP 주석 --%>
	<!-- HTML 주석 -->

	번호 :
	<%=member.getNo() %>, 아이디 :
	<%=member.getUserId() %>
	, 비밀번호 :
	<%=member.getUserPw() %>
	, 성별 :
	<%=member.getGender() %>
	, 취미 :
	<%=member.getHobby() %>
	, 핸드폰 :
	<%=member.getPhone() %>
	, 출신 :
	<%=member.getCity() %>
	, 추가 :
	<%=member.getMemo() %>

	<%
	List<MemberDto> members = new ArrayList<MemberDto>();
	members.add(new MemberDto(1,"m1", "11", "남", "등반", "010-0000-0000", "서울", "정보"));
	members.add(new MemberDto(2,"m2", "12", "여", "영회", "010-0000-0000", "광주", "정보"));
	members.add(new MemberDto(3,"m3", "13", "남", "등산", "010-0000-0000", "부산", "정보"));
	members.add(new MemberDto(4,"m4", "14", "여", "게임", "010-0000-0000", "대구", "정보"));
	members.add(new MemberDto(5,"m5", "15", "남", "등반", "010-0000-0000", "경기", "정보"));
	%>
	<table>
	<tr>
	<th>번호</th>
	<th>아이디</th>
	<th>비밀번호</th>
	<th>성별</th>
	<th>취미</th>
	<th>핸드폰</th>
	<th>출신</th>
	<th>정보</th>
	</tr>
	<%
	for(MemberDto i:members){
	%>
	<tr>
	<td><%=i.getNo() %></td>
	<td><%=i.getUserId() %></td>
	 <td><%=i.getUserPw() %></td>
	 <td><%=i.getGender() %></td>
	 <td><%=i.getHobby() %></td>
	 <td><%=i.getPhone() %></td>
	 <td><%=i.getCity() %></td>
	 <td><%=i.getMemo() %></td>
	 </tr>
	<%
	} 
	%>
	</tbody>
	</table>
</body>
</html>