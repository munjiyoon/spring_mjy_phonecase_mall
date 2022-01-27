<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
	
<script src="/resources/jquery/jquery.min.js"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/main.css">

<html>
<head>
<title>Main</title>
</head>
<body>

		<!-- 로그인 하지 않은 상태 -->
	 	<c:if test = "${member == null }">           
             <a href="${pageContext.request.contextPath}/member/login">로그인</a>
             <a href="${pageContext.request.contextPath}/member/join">회원가입</a>            		
        </c:if> 
        
        
        <!-- 로그인한 상태 -->
        <c:if test="${member != null }">                
             
            <c:if test="${member.userid == 'admin'}">
               <span><a href="${pageContext.request.contextPath}/admin/page">관리자 페이지</a></span>&nbsp;&nbsp;
                
            </c:if>
            
               	
            <a href="${pageContext.request.contextPath}/member/logout">로그아웃</a>&nbsp;&nbsp;  
            
            
            <span>MyPage</span>&nbsp;&nbsp;
            <span>장바구니</span>&nbsp;&nbsp;
            <span> <a href="${pageContext.request.contextPath}/community/notice">Community</a></span>
            
            
            <br>
            <span>${member.userid}님 환영합니다!</span>
            <span>현재 적립금 :${member.miliage}원</span> &nbsp;&nbsp;
            
            <div>
            	 <img class="img" src="${pageContext.request.contextPath}/resources/img/case1.png">       	 
            </div>
            
           <div>
           <a class="img1" href="${pageContext.request.contextPath}/shop/view">곤뇽이 케이스</a>
       
           </div>
             
             
            
         
          
          	
        </c:if>   
</body>
</html>
