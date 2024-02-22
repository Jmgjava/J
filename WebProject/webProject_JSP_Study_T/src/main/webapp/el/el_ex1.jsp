<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>

<%
	request.setAttribute("id1111", "m1");
	request.setAttribute("pw1111", "11");
%>
id: <%=request.getAttribute("id1111") %> <br />
pw: <%=request.getAttribute("pw1111") %> <br />

id: ${id1111} <br />
pw: ${pw1111} <br />
숫자: ${11 } <br />
문자열: ${'문자열'} <br />

<%
	String[] arr={"JAVA","HTML","JSP","SPRING"};
  request.setAttribute("arrList", arr);
%>
<%-- scope(범위) request --%>
1. ${arrList[0]} <br /> 
2. ${arrList[1]} <br /> 
3. ${arrList[2]} <br /> 
4. ${arrList[3]} <br /> 

</body>
</html>