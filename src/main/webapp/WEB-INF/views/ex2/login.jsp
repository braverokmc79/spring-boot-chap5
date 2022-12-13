<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>


<c:choose>
	<c:when test="${loginError eq 'error'}">
	 <h1><b>오류 발생</b></h1>
	 <p>오류 메시지 : 암호가 일치하지 않습니다.</p>
	 <hr>
	 <a href="login">[로그인]</a>
	</c:when>
	<c:otherwise>	
		<form action="login" method="post">
			이메일: <input type="email" name="email" id="email">
			<br>
			암호: <input type="password" name="password" id="password">
			<br><br>
			<button>로그인</button>
		</form>	
	</c:otherwise>
</c:choose>


</body>
</html>