<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 삭제</title>
</head>
<body>

	<c:choose>
		<c:when test="${msg eq 'error'}">
		 <h1><b>오류 발생</b></h1>
		  <hr>
			 <p>오류 메시지 : 삭제할 권한이 없습니다.</p>		
		 <a href="list">[목록]</a>
		</c:when>
		<c:when test="${msg eq 'success' }">
		 <h1><b>실행 완료</b></h1>
		  <hr>
			 <p>실행 메시지: 정상적으로 삭제되었습니다.</p>		
		 <a href="list">[목록]</a>

		</c:when>		
	</c:choose>



</body>
</html>