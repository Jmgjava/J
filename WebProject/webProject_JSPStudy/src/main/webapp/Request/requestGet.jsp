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
	request.setCharacterEncoding("UTF-8");
%>

쿠키: <%=request.getCookies() %> <br />
method: <%=request.getMethod() %> <br />
Session객체: <%=request.getSession() %> <br />
요청주소: <%=request.getRemoteAddr() %> <br />
서버이름: <%=request.getServerName() %> <br />
서버포트: <%=request.getServerPort() %> <br />
요청URI: <%=request.getRequestURI() %> <br />
요청URI쿼리 스트링: <%=request.getQueryString() %> <br />
기본 패스: <%=request.getContextPath() %> <br />
요청 캐릭터 셋: <%=request.getCharacterEncoding() %> <br />

헤더의 정보 <br />
접속 경로: <%=request.getHeader("referer") %> <br />
유저의 시스템 정보: <%=request.getHeader("user-agent") %> <br />
접속 ip: <%=request.getHeader("host") %> <br />
접속 경로: <%=request.getHeader("WL-Proxy-Client-IP") %> <br />
Proxy: <%=request.getHeader("Proxy-Client-IP") %> <br />
클라이언트 ip주소 가져오기: <%=request.getHeader("") %> <br />

</body>
</html>