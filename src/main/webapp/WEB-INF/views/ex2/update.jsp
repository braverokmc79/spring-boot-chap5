<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정</title>
<style type="text/css">
textarea {
	width: 300px;
	height: 150px
}
</style>
</head>
<body>

	<c:choose>
		<c:when test="${msg eq 'error'}">
		 <h1><b>오류 발생</b></h1>
		  <hr>
			 <p>오류 메시지 : 수정할 권한이 없습니다.</p>		
		 <a href="list">[목록]</a>
		</c:when>
		<c:when test="${msg eq 'success' }">
		 <h1><b>실행 완료</b></h1>
		  <hr>
			 <p>실행 메시지: 정상적으로 수정되었습니다.</p>		
		 <a href="list">[목록]</a>

		</c:when>
		<c:otherwise>
			<form action="update" method="post">
				번호:<br> ${articleVO.articleNo}<br>
				<input type="hidden" value="${articleVO.articleNo}" name="articleNo">
				<br> 제목: <br> <input type="text" name="title" value="${articleVO.title}"> <br>

				<p>
					내용: <br>
					<textarea name="content">${articleVO.content}</textarea>
				</p>
				<br>
				<button>글 수정</button>
			</form>
		</c:otherwise>
	</c:choose>



</body>
</html>