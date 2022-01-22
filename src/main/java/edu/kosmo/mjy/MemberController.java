package edu.kosmo.mjy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.kosmo.mjy.service.MemberService;
import edu.kosmo.mjy.vo.MemberVO;
import lombok.extern.log4j.Log4j;

@Controller // 컨트롤러의 역할을 한다고 스프링에 선언하는 역할
@Log4j // 로그 기록
@RequestMapping(value = "/member")
public class MemberController {

	@Autowired MemberService memberService;
	
	// 회원가입
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinPOST(MemberVO memberVO) throws Exception {

		log.info("join 진입");

		// 회원가입 서비스 실행
		memberService.memberJoin(memberVO);

		log.info("join Service 성공");
		return "redirect:/main";

	}

	// 회원가입 페이지 이동
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public void joinGET() {

		log.info("회원가입 페이지 진입");

	}

	// 로그인 페이지 이동
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void loginGET() {

		log.info("로그인 페이지 진입");

	}

}
