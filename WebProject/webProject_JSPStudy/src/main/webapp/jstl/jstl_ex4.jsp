<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl xml</title>
</head>
<body>
	<c:set var="xmlData">
		<study>
		 <subject>
		 <name>JAVA</name>
		 <time>200</time>
		  </subject> 
		 <subject>
		 <name>SQL</name>
		 <time>150</time>
		  </subject> 
		 <subject>
		 <name>WEB</name>
		 <time>100</time>
		  </subject> 
		  </study>
	</c:set>
	<x:parse xml="${xmlData }" var="outData"/>
	<x:out select="$outData/study/subject[1]/name"/>
</body>
</html>