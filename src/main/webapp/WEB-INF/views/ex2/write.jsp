<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 쓰기</title>
<style type="text/css">
textarea{width: 300px; height: 150px }
</style>
</head>
<body>
<form action="write" method="post">
제목: <br>
<input  type="text" name="title">
<br>

<p>
내용:
<br>
<textarea name="content" ></textarea>
</p>
<br>
<button>새글 등록</button>
</form>

</body>
</html>