<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/security/tags"
   prefix="sec"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>product list page</title>
</head>
<body>
   
   <span><a href="${pageContext.request.contextPath}/admin/enroll">상품 등록</a></span>&nbsp;&nbsp;
   <span><a href="${pageContext.request.contextPath}/admin/productList">상품 목록</a></span>&nbsp;&nbsp;
   <span>회원 목록</span>&nbsp;&nbsp;
   <span>상품 소감</span>
   <span><a href="${pageContext.request.contextPath}/main/">메인 페이지</a></span>&nbsp;&nbsp;
   <span><a href="${pageContext.request.contextPath}/member/logout">로그아웃</a></span>
   
   <br>
   
   <table border="1">
      
      <tr>
         <th>상품 번호</th>
         <th>상품 이름</th>
         <th>상품 가격</th>
         <th>상품 재고</th>
      </tr>

      <c:forEach var="product" items="${productList}">
         <tr>
            <td>${product.productid}</td>
      
            <td><a href="productView?productid=${product.productid}">${product.productname}</a></td>
           
            <td><fmt:formatNumber value="${product.productprice}" type="currency"/></td>
            <td>${product.productstock}</td>
         </tr>
      </c:forEach>
   </table>

</body>
</html>
