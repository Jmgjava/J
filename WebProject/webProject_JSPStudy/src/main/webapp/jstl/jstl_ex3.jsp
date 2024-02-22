<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>
<h3>숫자</h3>
<c:set var="num1" value="15.12345"/>
숫자1: <fmt:formatNumber value="12345" type="number" /> <br />
숫자2: <fmt:formatNumber value="12345" type="currency" currencySymbol="@"/> <br />
숫자3: <fmt:formatNumber value="0.15" type="currency" currencySymbol="%"/> <br />
숫자3: <fmt:formatNumber value="0.15" pattern=".0" /> <br />
숫자3: <fmt:formatNumber value="${num1}" pattern=".0" /> <br />

<h3>날짜</h3>
<c:set var="now" value="<%= new Date()%>"/>
<c:out value="${now }"/> <br />

오늘 날짜: <fmt:formatDate value="${now }" type="time"/> <br />
오늘 날짜: <fmt:formatDate value="${now }" type="date"/> <br />
오늘 날짜: <fmt:formatDate value="${now }" type="both"/> <br />

<h3>날짜 스타일</h3>
오늘 날짜(날짜, 시간): <fmt:formatDate value="${now }" type="both" dateStyle="short"/> <br />
오늘 날짜(날짜, 시간): <fmt:formatDate value="${now }" type="both" dateStyle="medium"/> <br />
오늘 날짜(날짜, 시간): <fmt:formatDate value="${now }" type="both" dateStyle="Long"/> <br />

<h3>날짜 커스텀</h3>
오늘 날짜(날짜, 시간): <fmt:formatDate value="${now }" type="both" dateStyle="Long" pattern="yyyy-mm-dd"/> <br />
오늘 날짜(날짜, 시간): <fmt:formatDate value="${now }" type="both" dateStyle="Long" pattern="yyyy/mm/dd"/> <br />
오늘 날짜(날짜, 시간): <fmt:formatDate value="${now }" type="both" dateStyle="Long" pattern="yyyy년mm월dd일"/> <br />
오늘 날짜(날짜, 시간): <fmt:formatDate value="${now }" type="both" dateStyle="Long" pattern="yyyy년mm월dd일 hh시mm분ss초"/> <br />
	     



</body>
</html>