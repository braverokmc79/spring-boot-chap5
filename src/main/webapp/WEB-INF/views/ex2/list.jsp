<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 리스트</title>
<style>
table{width: 800px}
</style>
</head>
<body>
<c:choose>
	<c:when test="${empty sessionScope.LoginInfo}">
		<a href="login">[로그인]</a>
	</c:when>
	<c:otherwise>
		'${LoginInfo.name}'님 로그인 중. <a href="write">[게시글 쓰기]</a> <a href="logout">[로그아웃]</a>
		
	</c:otherwise>
</c:choose>
<hr>
<br>

<table border="1">
<thead>
 <tr>
 	<th width="5%">번호</th>
 	<th width="25%">제목</th>
 	<th width="10%">작성자</th>
 	<th width="18%">작성일</th>
 	<th width="18%">최종 수정일</th>
 	<th width="8%">조회수</th>
 </tr>
</thead>
<tbody>
	<c:forEach items="${list}" var="row" varStatus="status">
		<tr>
			<td align="center">${status.count}</td>
			<td><a href="read?aid=${row.articleNo}">${row.title}</a></td>
			<td align="center">${row.name}</td>
			<td align="center"><fmt:formatDate value="${row.regdate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
			<td align="center"><fmt:formatDate value="${row.moddate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
			<td align="center">${row.readCnt}</td>
		</tr>
	</c:forEach>
</tbody>
</table>


</body>
</html>