package edu.kosmo.mjy.service;

import edu.kosmo.mjy.vo.MemberVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

/*USERID   NOT NULL VARCHAR2(20) 
PASSWORD NOT NULL VARCHAR2(20) 
PHONE             VARCHAR2(20) 
AGE               NUMBER       
MILIAGE           NUMBER       
NAME              VARCHAR2(50) 
ADD1              VARCHAR2(20) 
ADD2              VARCHAR2(50)*/ 


public interface MemberService {
	
	//Service인터페이스는 ServiceImpl 클래스가 구현
	public void memberJoin(MemberVO memberVO) throws Exception; //회원가입 memberJoin메소드
	
	//public MemberVO memberLogin(MemberVO memberVO) throws Exception; //로그인  //MemberVO를 파라미터, 반환 값으로 사용
}