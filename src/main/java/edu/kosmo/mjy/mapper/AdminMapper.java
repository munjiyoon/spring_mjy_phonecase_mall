package edu.kosmo.mjy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import edu.kosmo.mjy.vo.ProductVO;

@Mapper
public interface AdminMapper {

	// 상품등록
	public void productEnroll(ProductVO productVO);
												
	//상품목록
	public List<ProductVO> getProductList();
	

	
}