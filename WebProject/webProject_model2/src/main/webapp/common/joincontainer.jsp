<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<div class="container">
	
	<div class="join">
	<div class="join-con">
	<form action="joinOk.do" method="POST">
	id : <input type="text" name="userId" id="userId" /> <br />
	pw : <input type="password" name="userPw" id="userPw" /> <br />
	성별 : <input type="radio" name="gender" id="gender" value="M"/>남자 
			 <input type="radio" name="gender" id="gender" value="W"/>여자 <br />
			 
	취미 : <input type="checkbox" name="hobby" id="hobby" value="영화"/>영화 
		  <input type="checkbox" name="hobby" id="hobby" value="운동"/>운동
		  <input type="checkbox" name="hobby" id="hobby" value="게임"/>게임 <br />
	자기소개 : <textarea rows="5" cols="30" name="memo"></textarea> <br />
		<input type="reset" value="초기화" />
		<input type="submit" value="회원가입" />
	
	</form>
		
	
	</div>
	</div>
	
	</div>

