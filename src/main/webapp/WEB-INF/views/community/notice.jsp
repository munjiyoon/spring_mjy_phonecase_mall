<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	
	<script type="text/javascript">

	
	</script>
	

</head>
<body>
	<h1>공지</h1>
	<p>공지사항 입니다</p>
	<table width="500" cellpadding="0" cellspacing="0" border="1">
	
		<tr>
		<td>번호</td>
		<td>제목</td>
		<td>내용</td>
		<td>작성자</td>
		</tr>
		
		<c:forEach var="board" items="${list}" >
			<tr>
				<td>${board.bid}</td>
				<td>${board.btitle}</td>
				<td>${board.bcontent}</td>
				<td>${board.userid}</td> 
						
			</tr>
		</c:forEach>
		
		<tr>
			<td colspan="5"> <a href="write_view">글작성</a> </td>
		</tr>
	</table>

</body>
</html>
</body>
</html>

