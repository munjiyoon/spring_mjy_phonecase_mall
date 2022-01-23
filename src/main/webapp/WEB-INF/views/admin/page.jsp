<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>



<html>
<head>
<title>admin page</title>
</head>
<body>
	
	<a href="${pageContext.request.contextPath}/main/">메인 페이지</a>&nbsp;&nbsp;
   <a href="${pageContext.request.contextPath}/member/logout">로그아웃</a>&nbsp;&nbsp;   
   <hr> <br>
      
   <table width="500" cellpadding="0" cellspacing="0" border="1">
            
      <tr>
         <td><a href="${pageContext.request.contextPath}/admin/enroll">상품 등록</a></td>   
         <td rowspan="4" style="width:70%">본문영역</td>   
      </tr>
            
      <tr>
         <td><a href="${pageContext.request.contextPath}/admin/productList">상품 목록</a></td>      
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
