<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	request.setCharacterEncoding("UTF-8");
 
  String userId=request.getParameter("userId");
 	String userPw=request.getParameter("userPw");  	
	String[] phoneArr=request.getParameterValues("phone"); 	
 	//배열을 하나의 문자열 -> 
 	String phone=""; 	
 	int i=0;
 	for(String el: phoneArr){
 		if(i>=phoneArr.length-1){
 			phone+=el; // 010-1111-2222
 			break;
 		}
 		phone+=el+"-"; // 010-1111-2222-
 		i++;
 	} 
 	
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원등록정보</h1>
아이디: <%=userId %> , 비빌번호: <%=userPw %> , 전화번호: <%=phone %>


<h1>요청 name 목록</h1>
<%
	//Enumeration 인터페이스는 객체들의 집합(Vector)에서 각각의 객체들을 
	// 한순간에 하나씩 처리할 수 있는 메소드를 제공하는 켈렉션이다.
	Enumeration en=request.getParameterNames(); // 요청 name모두	
	//name이 존재하면 
	while(en.hasMoreElements()){
		//Object ->  String으로 변환 
		String nameVal= en.nextElement().toString();
		
		out.println(nameVal+"<br>");
	}

%>














</body>
</html>