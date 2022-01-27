package edu.kosmo.mjy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


import edu.kosmo.mjy.vo.BoardVO;
import edu.kosmo.mjy.vo.MemberVO;

@Mapper
public interface BoardMapper {

	//게시판 리스트 전체를 불러옴 
	public List<BoardVO> getList();
	

}