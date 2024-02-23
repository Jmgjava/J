<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
</head>
<body>

	<div class="header">
		<div class="nav">
			<h1 class="logo">
				<a href="index.do"><img src="images/logo.png" alt="" /></a>
			</h1>
			<div class="gnb">
				<ul>
					<li><a href="index.do">index</a></li>
					<li><a href="memberList.do">list</a></li>

					<%
					String sessionId = (String) session.getAttribute("sessionId");
					if (sessionId != null) {
						// 로그인 상태
					%>
					<li><a href="logoutOk.do">logout</a></li>
					<li><a href="memberDetail.do?userId=<%=sessionId%>"><%=sessionId%>님
					</a></li>
					<%
					} else {
						// 로그아웃 상태
					%>
					<li><a href="join.do">join</a></li>
					<li><a href="login.do">login</a></li>
					<%
					}
					%>


				</ul>
			</div>
		</div>
	</div>

</body>
</html>