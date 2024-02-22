<%@page import="java.util.Enumeration"%>
<%@page import="org.jcp.xml.dsig.internal.dom.DOMExcC14NMethod"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

String userId = request.getParameter("userId");
String userPw = request.getParameter("userPw");

/* String[] Arr1 = { "a", "b", "c" };

int i = 0;
for (String el : Arr1) {
	if (i >= Arr1.length - 1) {
		phone = el +",";
		break;
	}

} */

String[] phoneArr = request.getParameterValues("phone");

/* 배열을 하나의 문자열 */
String phone = "";

int i = 0;

for (String el : phoneArr) {
	if (i >= phoneArr.length - 1) {
		phone += el;
		break;
	}
	phone += el + "-";
	i++;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinOk</title>
</head>
<body>
	<h1>회원등록정보</h1>
	아이디:
	<%=userId%>
	, 비밀번호:
	<%=userPw%>, 전화번호:
	<%=phone%>

	<h1>names</h1>
	<%
	// Enumeration 인터페이스는 객체들의 집합(Vector)에서 각각의 객체들을
	// 한순간에 하나씩 처리할 수있는 메소드를 제공하는 컬렉션이다.
	Enumeration en = request.getParameterNames(); // 요청 name모두
	// name이 존재하면
	while (en.hasMoreElements()) {
		// Object -> String으로 변환
		String nameVal = en.nextElement().toString();

		out.println(nameVal = "<br>");
	}
	%>


</body>
</html>