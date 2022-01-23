package edu.kosmo.mjy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.kosmo.mjy.mapper.AdminMapper;
import edu.kosmo.mjy.mapper.MemberMapper;
import edu.kosmo.mjy.vo.MemberVO;
import edu.kosmo.mjy.vo.ProductVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminMapper adminMapper;

	@Override
	public void productEnroll(ProductVO productVO) throws Exception {
		adminMapper.productEnroll(productVO);
		
	}

	@Override
	public List<ProductVO> getProductList() {
		// TODO Auto-generated method stub
		return adminMapper.getProductList();
	}
	
}