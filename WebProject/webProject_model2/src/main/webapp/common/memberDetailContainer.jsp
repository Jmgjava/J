<%@page import="org.web.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	MemberDto member= (MemberDto)request.getAttribute("member");
%>


	<div class="container">
	
	<div class="memberDetail">
	<div class="memberDetail-con">
	<div>
	번호: <%=member.getNo() %> <br />
	id: <%=member.getUserId() %> <br />
	pw: <%=member.getUserPw() %> <br />
	성별: <%=member.getGender() %> <br />
	취미: <%=member.getHobby() %> <br />
	자기소개: <%=member.getMemo() %> <br />
	</div>
	<form action="memberUpdateOk.do" method="POST">
	<%-- 기본키(no)보이지 않게, 수정하지 못하게 --%>
	<input type="hidden" name="no" id="no" value="<%=member.getNo() %>" /> <%-- 변경 금지(수정X) --%>
	id : <input type="text" name="userId" id="userId" value="<%= member.getUserId() %>" readonly /> <br />
	
	pw : <input type="password" name="userPw" id="userPw" value="<%= member.getUserPw() %>"/> <br />
	
	성별 : <input type="radio" name="gender" value="M" <c:if test="${member.gender eq 'M' }">  checked </c:if>     />남자  
  	 <input type="radio" name="gender" value="W" <c:if test="${member.gender eq 'W' }">  checked </c:if>  
  	 />여자 <br />
  	 
	취미 : <input type="checkbox" name="hobby" id="hobby" value="영화" <c:if test="${fn:contains(member.hobby,'영화')}">  checked </c:if>    />영화 
		  <input type="checkbox" name="hobby" id="hobby" value="운동"  <c:if test="${fn:contains(member.hobby,'운동')}">  checked </c:if> />운동
		  <input type="checkbox" name="hobby" id="hobby" value="게임"  <c:if test="${fn:contains(member.hobby,'게임')}">  checked </c:if> />게임 <br />
		  
	자기소개 : <textarea rows="5" cols="30" name="memo"><%=member.getMemo() %></textarea> <br />
		<input type="reset" value="초기화" />
		<input type="submit" value="회원수정" />
	
	</form>
		
	
	</div>
	</div>
	
	</div>

