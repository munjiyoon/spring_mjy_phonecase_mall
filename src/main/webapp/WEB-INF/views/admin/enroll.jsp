<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>



<html>
<head>
<title>product enroll page</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/main/">메인 페이지</a>&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath}/member/logout">로그아웃</a>&nbsp;&nbsp;	
	<hr> <br>
		
	<table width="500" cellpadding="0" cellspacing="0" border="1">
				
		<tr>
			<td>상품 등록</td>	
			<td rowspan="4" style="width:70%">
			<form method="post">

				상품 번호: <input type="text" id="productid" name="productid" required="required" size = "10" /> <br>
			
				상품 이름: <input type="text" id="productname" name="productname" required="required" size = "10" /> <br>
			
				상품 가격: <input type="text" id="productprice" name="productprice" required="required" size = "10" /> <br>
				
		
				<textarea rows="5" cols="50" id="productdes" name="productdes"></textarea> 상품 설명 <br>
				
				상품 이미지:<input type="text" id="productimg" name="productimg" size = "10" /> <br>
				
				상품 재고:<input type="text" id="productimg" name="productimg" size = "10" /> <br>
				

			<button type="submit" id="enroll_btn" name="enroll_btn">상품 등록</button>

			</form>
			
			
			</td>	
		</tr>
			
		<tr>
			<td>상품목록</td>	
			
		</tr>
		
		<tr>
			<td>회원목록</td>	
			
		</tr>
		
		<tr>
			<td>상품소감</td>		
		</tr>
		
	</table>
	
	
	 
	
		
</body>
</html>
