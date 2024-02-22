<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL연산</h1>
	<table border="1">
		<thead>
			<tr>
				<th>표현식</th>
				<th>EL</th>
				<th>결과</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>출력</td>
				<td>${10 }</td>
				<td>${10 }</td>
			</tr>
			<tr>
				<td>더하기</td>
				<td>${10+20 }</td>
				<td>${10+20 }</td>
			</tr>
			<tr>
				<td>빼기</td>
				<td>${10-20 }</td>
				<td>${10-20 }</td>
			</tr>
			<tr>
				<td>곱하기</td>
				<td>${10*20 }</td>
				<td>${10*20 }</td>
			</tr>
			<tr>
				<td>나누기</td>
				<td>${10/20 }</td>
				<td>${10/20 }</td>
			</tr>
			<tr>
				<td>나머지</td>
				<td>${10%20 }</td>
				<td>${10%20 }</td>
			</tr>
			<tr>
				<td>나머지</td>
				<td>${10 mod 20 }</td>
				<td>${10 mod 20 }</td>
			</tr>
			<%-- <tr>
				<td>0으로 나누기</td>
				<td>${10/0 }</td>
				<td>${10/0 }</td>
			</tr> --%>
			<tr>
				<td>지수</td>
				<td>${2E2 }</td>
				<td>${2E2 }</td>
			</tr>
			<tr>
				<td>음수</td>
				<td>${-10 }</td>
				<td>${-10 }</td>
			</tr>
			<tr>
				<td>==</td>
				<td>${10==5 }</td>
				<td>${10==5 }</td>
			</tr>
			<tr>
				<td>eq</td>
				<td>${10 eq 5 }</td>
				<td>${10 eq 5 }</td>
			</tr>
			<tr>
				<td>ne</td>
				<td>${10 ne 5 }</td>
				<td>${10 ne 5 }</td>
			</tr>
			<tr>
				<td>lt</td>
				<td>${10 lt 5 }</td>
				<td>${10 lt 5 }</td>
			</tr>
			<tr>
				<td>gt</td>
				<td>${10 gt 5 }</td>
				<td>${10 gt 5 }</td>
			</tr>
			<tr>
				<td>le</td>
				<td>${10 le 5 }</td>
				<td>${10 le 5 }</td>
			</tr>
			<tr>
				<td>ge</td>
				<td>${10 ge 5 }</td>
				<td>${10 ge 5 }</td>
			</tr>
			<tr>
				<td>ge</td>
				<td>${true ge true }</td>
				<td>${true ge true }</td>
			</tr>
						<tr>
				<td>ge</td>
				<td>${true ge false }</td>
				<td>${true ge false }</td>
			</tr>
		</tbody>


	</table>

</body>
</html>