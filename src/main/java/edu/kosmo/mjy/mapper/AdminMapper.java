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
	
	//상품 조회
	//http://localhost:8282/mjy/admin/productView?productid=10
	public ProductVO read(int productid);
	
	//상품 삭제
	void delete(int productid);
	
	//상품 수정
	void update(ProductVO productVO);

}