<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out.jsp</title>
</head>
<body>
<table border="1" width="600px" align="center">
	<caption>resultMap 출력</caption>
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>전화</th>
		<th>총점</th>
		<th>직위</th>
		<th>수령액</th>
	</tr>
	<c:forEach items="${list }" var="aa">
		<tr>
			<td>${aa.id }</td>
			<td>${aa.myinfoDTO.name }</td>
			<td>${aa.myinfoDTO.phone }</td>
			<td>${aa.tot }</td>
			<td>${aa.insaDTO.spot }</td>
			<td>${aa.insaDTO.totpay }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
