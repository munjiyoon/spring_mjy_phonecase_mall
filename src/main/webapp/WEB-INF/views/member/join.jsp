<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<html>
<head>
<title>회원가입</title>
</head>
<body>

	<form method="post">

		아이디 <input type="text" id="userid" name="userid" required="required" /> <br>
			
		패스워드:<input type="password" id="password" name="password" required="required" /> <br>
			
		연락처 <input type="text" id="phone" name="phone" placeholder="연락처를 입력해주세요" /> <br>
		
		이름:<input type="text" id="name" name="name" placeholder="네임을 입력해주세요" /> <br>

		<button type="submit" id="join_btn" name="join_btn">회원가입</button>

	</form>



</body>
</html>
