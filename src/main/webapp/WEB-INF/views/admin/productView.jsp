<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>



<html>
<head>
<title>productView page</title>
</head>
<body>

	<table width="500" cellpadding="0" cellspacing="0" border="1">
		<form action="modify" method="post">
			<input type="hidden" name="productid"
				value="${productView.productid}">

			<tr>
				<td>상품 번호</td>
				<td>${productView.productid}</td>
			</tr>

			<tr>
				<td>상품명</td>
				<td><input type="text" name="productname"
					value="${productView.productname}"></td>
			</tr>

			<tr>
				<td>상품 가격</td>
				<td><input type="text" name="productprice"
					value="${productView.productprice}"></td>
			</tr>

			<tr>
				<td>상품 재고</td>
				<td><input type="text" name="productstock"
					value="${productView.productstock}"></td>
			</tr>

			<tr>
				<td>상품 설명</td>
				<td><textarea rows="10" name="productdes">${productView.productdes}</textarea></td>
			</tr>

			<tr>
				<td>상품 이미지</td>
				<td><input type="text" name="productimg"
					value="${productView.productimg}"></td>
			</tr>

			<tr>
				<td colspan="2">
					 <input type="submit" value="수정"> &nbsp;&nbsp; 					
             		 <a href="delete?productid=${productView.productid}">삭제</a> 	
				</td>
			</tr>

			






		</form>
	</table>











</body>
</html>
