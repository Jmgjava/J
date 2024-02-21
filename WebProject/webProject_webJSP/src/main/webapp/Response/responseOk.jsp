<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%
	// 문자열 -> 숫자
	int age = Integer.parseInt(request.getParameter("age"));
	
	if(age>=18){
		response.sendRedirect("pass.jsp?age="+age);
	}else{
		response.sendRedirect("noPass.jsp?age="+age);
	}
	
	%>
