<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입페이지</title>
</head>
<body>
	<h1>회원가입</h1>
	<form action="joinOk.do" method="POST">
		아이디: <input type="text" name="userId"> <br>
		비밀번호: <input type="text" name="userPw"> <br>
		이름: <input type="text" name="userName"> <br>
		<input type="submit" value="회원 가입">
	</form>
</body>
</html>