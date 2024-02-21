<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setAttribute("Id", "m1");
	request.setAttribute("Pw", "11");
	%>
	id:
	<%=request.getAttribute("Id")%>
	<br /> Pw:
	<%=request.getAttribute("Pw")%>
	<br /> Id: ${Id}
	<br /> Pw: ${Pw}
	<br /> 숫자: ${11 }
	<br /> 문자열: ${'문자열'}
	<br />

	<%
	String[] arr = { "JAVA", "HTML", "JSP", "SPRING" };
	request.setAttribute("arrList", arr);
	%>
	<!-- scope(범위) request -->
	1. ${arr[0]} <br />
	1. ${arr[1]} <br />
	1. ${arr[2]} <br />
	1. ${arr[3]} <br />
	

</body>
</html>