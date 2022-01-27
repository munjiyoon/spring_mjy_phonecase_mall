package edu.kosmo.mjy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import edu.kosmo.mjy.mapper.AdminMapper;
import edu.kosmo.mjy.service.AdminService;
import edu.kosmo.mjy.service.MemberService;
import edu.kosmo.mjy.vo.MemberVO;
import edu.kosmo.mjy.vo.ProductVO;
import lombok.extern.log4j.Log4j;

@Controller // 컨트롤러의 역할을 한다고 스프링에 선언하는 역할
@Log4j // 로그 기록
@RequestMapping(value = "/admin*")
public class AdminController {

	@Autowired // AdminService의 메서드를 사용할 수 있도록 의존성 주입
	AdminService adminService;

	//상품목록
	@RequestMapping(value = "/productList", method = RequestMethod.GET)
	public String productListGet(Model model) {

		// System.out.println("전달된 데이터 : " + memberVO);

		log.info("productListGet()..");
		model.addAttribute("productList", adminService.getProductList());

		return "admin/productList";
	}
	
	
	//상품 등록
	@PostMapping("/enroll")
	public String productEnrollPost(ProductVO productVO, RedirectAttributes rttr) throws Exception {

		log.info("productEnrollPost.." + productVO);

		adminService.productEnroll(productVO);

		rttr.addFlashAttribute("enroll_result", productVO.getProductname());

		return "redirect:/admin/page";
	}

	
	//상품 수정
	@PostMapping("/modify")
	public String modify(ProductVO productVO, Model model) {
		
		log.info("modify() ...");
		System.out.println("ProductVO:" + productVO);
		
		adminService.modify(productVO);
		
		
		return "redirect:productList"; 
		
	}
	
	
	//상품 조회
	@GetMapping("/productView")
	public String productView(ProductVO productVO, Model model) {
			
			log.info("productView() ..");
			log.info("productView : " + productVO);
			
			int productid = productVO.getProductid();
			
			model.addAttribute("productView", adminService.read(productid));
				
			return "admin/productView";
			
	}
	
	//상품 삭제
		@GetMapping("/delete")
		public String delete(ProductVO productVO, Model model) {
				
			log.info("delete() ..");		
		
			adminService.delete(productVO.getProductid());
			
			
			log.info("productVO : " + productVO);
			
			return "redirect:productList";
				
				
		}
	  
		
	  
	// 상품 등록 페이지 이동
	@RequestMapping(value = "/enroll", method = RequestMethod.GET)
	public void enrollGet() {

		log.info("상품등록 페이지 진입");

	}

	// 관리자 페이지 이동
	@RequestMapping(value = "/page", method = RequestMethod.GET)
		public void loginGET() {

		log.info("관리자 페이지 진입");

	}
}