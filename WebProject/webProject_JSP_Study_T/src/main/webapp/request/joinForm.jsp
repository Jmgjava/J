<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	<form action="joinO.do"></form> -->

<form action="joinOk.jsp" method="POST">
	id : <input type="text" name="userId" id="userId" /> <br />
	pw : <input type="password" name="userPw" id="userPw" /> <br />
	전화번호: 
	<select name="phone" class="phone">
		<option value="010">010</option>
		<option value="011">011</option>
		<option value="012">012</option>
	</select>
	 - <input type="text" name="phone" class="phone" maxlength="4" size="4"/>
	 - <input type="text" name="phone" class="phone" maxlength="4" size="4" />  <br />
	<input type="submit" value="회원가입실행" />
</form>

</body>
</html>