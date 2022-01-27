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
@RequestMapping(value = "/shop*")
public class ShopController {

//http://localhost:8282/mjy/shop/view	
	
	// 관리자 페이지 이동
	@RequestMapping(value = "/view", method = RequestMethod.GET)
		public String viewGET() {

		log.info("상품 상세페이지 진입");
		return "/shop/view";
	}
}