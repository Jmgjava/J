<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
</head>
<body>
	<!-- <form action="joinOk.do"></form> -->
	<form action="joinOk.jsp" method="POST">
	Id : <input type="text" name="userId" id="userId" />
	Pw : <input type="password" name="userPw" id="userPw" />
	전화번호 :
	<select name="phone" id="phone">
	<option value="010">010</option>
	<option value="011">011</option>
	<option value="012">012</option>
	</select>
	<input type="text" name="phone" class="phone" maxlength="4" size="4" />
	<input type="text" name="phone" class="phone" maxlength="4" size="4" /> <br />
	<input type="submit" value="회원가입 실행" />
	</form>

</body>
</html>