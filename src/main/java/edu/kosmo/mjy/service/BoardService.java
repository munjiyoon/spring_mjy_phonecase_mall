package edu.kosmo.mjy.service;


import java.util.List;

import edu.kosmo.mjy.vo.BoardVO;
import edu.kosmo.mjy.vo.MemberVO;
import edu.kosmo.mjy.vo.ProductVO;
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


public interface BoardService {
	
	//상품 등록 서비스단에는 mappper의 메소드와 이름이 같아도 상관없지만 사용자에게 좀더 친숙한 이름 사용
	List<BoardVO> getList();
}