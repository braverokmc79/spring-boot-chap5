<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 읽기</title>
<style type="text/css">
table {width: 400px}
th{width: 20%;}
</style>
</head>
<body>
<table border="1" >
<tbody>
<tr>
	<th>번호</th><td>${articleVO.articleNo}</td>
</tr>
<tr>
	<th>작성자</th><td>${articleVO.name}</td>
</tr>
<tr>
	<th>제목</th><td>${articleVO.title}</td>
</tr>
<tr>
	<th>내용</th><td>${articleVO.content}</td>
</tr>
<tr>
	<td colspan="2">
		<a href="list">[목록]</a> 
		<a href="update?aid=${articleVO.articleNo}">[게시글 수정]</a>
		<a href="delete?aid=${articleVO.articleNo}">[게시글 삭제]</a>		
	</td>	
</tr>
</tbody>
</table>



</body>
</html>