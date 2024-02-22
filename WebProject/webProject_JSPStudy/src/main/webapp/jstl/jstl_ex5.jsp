<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>
<%-- 함수(function) -> 명령문의 집합 -> 호출(call)을 통해 구현한다. --%>
<c:set var="str1" value="java jsp javascript html css"/>
<c:set var="str2" value="0123456789"/>

str1: <c:out value="${str1 }"/> <br />
str2: <c:out value="${str2 }"/> <br />

<%-- 포함 되어 있느냐? --%>
<c:out value="${fn:contains(str1,'java') }"/> <br />
<c:if test="${fn:contains(str1, 'java') }">
<c:out value="java가 존재함"/>
</c:if>

특정문자열 찾는 인덱스: ${fn:indexOf(str1, 'jsp')	} <br />
특정문자열 찾는 인덱스: ${fn:indexOf(str1, 'html') } <br />

문자열의 길이: ${fn:length(str1) } <br />
문자열의 길이: ${fn:length(str2) } <br />

<br><br><br>



<%---------------------------%>
문자열 변경: ${fn:replace(str1, 'jsp', 'jsp2024') } <br />
문자열 변경: ${fn:replace(str2, '123', '333') } <br />

<c:set var="str3" value="java jsp javascript"/>
구분자를 이용해서 문자열을 분리: ${fn:split(str3,' ') } <br />
<%-- 구분자로 분리시켜서 배열 --%>
<c:set var="strArr" value="${fn:split(str3,' ')}"/>
${str3Arr } <br />
<c:forEach var="i" items="${str3Arr }">
${i } <br />
</c:forEach>

<%-- 구분자를 이용해서 문자열을 합친다. --%>
 <c:set var="str3Join" value="${fn:join(str3Arr, '-') }"/> <br />
 ${str3Join } <br><br><br>
 
 
 
 
 
 
 <c:set var="str5" value="java jsp html"></c:set>
 ${str5}: 0번지부터 4번지앞(3번지)까지의 문자열을 추출 ->
 			 ${fn:substring(str5,0,4) } <br />
<%---------------------------%>







</body>
</html>