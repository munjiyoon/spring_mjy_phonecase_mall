package edu.kosmo.mjy.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.kosmo.mjy.vo.MemberVO;

@Mapper
public interface MemberMapper {
	
	//회원가입
	public void memberJoin(MemberVO memberVO); //타입 메소드명(매개변수,...);  MemberVO 데이터 타입의 memberVO 매개값이 필요하다는 뜻으로 memberJoin함수를 호출하면 xml로 구현해야함
		 
  //  public MemberVO memberLogin(MemberVO memberVO); //로그인
    
 
}