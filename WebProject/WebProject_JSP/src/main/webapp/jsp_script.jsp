<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!// 변수 선언
	int num1;
	int num2;

	// 메소드 선언
	public int sum(int num1, int num2) {
		int num3 = num1 + num2;
		return num3;
	}%>

<%
int num3 = 10;
int num4 = 20;

// 내장객체
// PrintWriter out = response.getWriter();
out.write(num3 + num4);

/* 주석 : ctrl + shift + / */
/* 	public int sum3(int num3,int num4){
		int num5=num3+num4;
		return num5;
	} */

out.print(sum(100,200));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Script</title>
</head>
<body>
	결과 : <%= sum(100,200) %> <br />
	결과 : <%= sum(100,200) %> <br />

</body>
</html>