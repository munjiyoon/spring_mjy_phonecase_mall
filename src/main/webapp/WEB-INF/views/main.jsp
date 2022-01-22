<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<html>
<head>
<title>Main</title>
</head>
<body>

	<a href="${pageContext.request.contextPath}/member/login">로그인</a>
	<a href="${pageContext.request.contextPath}/member/join">회원가입</a>

</body>
</html>
