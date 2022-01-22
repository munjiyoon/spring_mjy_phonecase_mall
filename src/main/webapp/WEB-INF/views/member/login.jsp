<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!-- jstl -->
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<html>
<head>
<title>로그인</title>
</head>
<body>
	<!-- 로그인 메서드에 데이터를 전달하기 위해 파라미터로 MemberVO 클래스를 이용 
	MemberVO에서 정의한 변수명과 반드시 속성명 name이 반드시 동일   -->
	<form method="post">
	 	
	 	아이디 : <input type="text" id="userid" name="userid" required="required" /><br> 
		비밀번호: <input type="password" id="password" name="password" required="required" /> <br>
	 	
	 			
		<c:if test = "${result == 0 }">
            <p>아이디와 비밀번호를 다시 입력해주세요!</p>
        </c:if>
		
		<button type="submit" id="login_btn" name="login_btn">로그인</button>      		
	</form>


</body>
</html>
