package edu.kosmo.mjy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kosmo.mjy.mapper.MemberMapper;
import edu.kosmo.mjy.vo.MemberVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;


@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMapper memberMapper;
	
	@Override
	public void memberJoin(MemberVO memberVO) throws Exception {
		memberMapper.memberJoin(memberVO);
		
	}	
}