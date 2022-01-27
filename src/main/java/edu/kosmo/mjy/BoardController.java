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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import edu.kosmo.mjy.mapper.AdminMapper;
import edu.kosmo.mjy.service.AdminService;
import edu.kosmo.mjy.service.BoardService;
import edu.kosmo.mjy.service.MemberService;
import edu.kosmo.mjy.vo.MemberVO;
import edu.kosmo.mjy.vo.ProductVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@RestController
@Log4j // 로그 기록
@RequestMapping(value = "/community*")

public class BoardController {

	@Autowired // AdminService의 메서드를 사용할 수 있도록 의존성 주입
	private BoardService boardService;

	@GetMapping("/notice")
	public ModelAndView list(ModelAndView mav) {
		
		mav.setViewName("community/notice");
		mav.addObject("list", boardService.getList());
		System.out.println(mav);
		
		log.info("notice()..");

		return mav;
	}
	
	

}