<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>product list page</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/main/">메인 페이지</a>&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath}/member/logout">로그아웃</a>&nbsp;&nbsp;	
	<hr> <br>
		
	<table border="1">
	<tr>   
         <td>상품 번호</td>
         <td>상품 이름</td>
         <td>상품 가격</td>
         <td>상품 설명</td>
         <td>상품 이미지</td>
         <td>상품 재고</td>
      </tr>
      
      <c:forEach var="product" items="${productList}" >
         <tr>
            <td>${product.productid}</td>
            <td>${product.productname}</td>
            <td>${product.productprice}</td>
            <td>${product.productdes}</td>
            <td>${product.productimg}</td>
            <td>${product.productstock}</td>      
         </tr>
      </c:forEach>

	
	
	
	
		
</body>
</html>
