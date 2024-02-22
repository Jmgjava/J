<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application</title>
</head>
<body>

프로젝트 기본경로: <%= application.getContextPath() %> <br />
서버(WAS) 버전: <%= application.getServerInfo() %> <br />
초기화파라미터: <%= application.getInitParameterNames() %> <br />

</body>
</html>