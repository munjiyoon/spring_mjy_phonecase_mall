package edu.kosmo.mjy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.kosmo.mjy.service.MemberService;
import edu.kosmo.mjy.vo.MemberVO;
import lombok.extern.log4j.Log4j;

@Controller // 컨트롤러의 역할을 한다고 스프링에 선언하는 역할
@Log4j // 로그 기록
@RequestMapping(value = "/member")
public class MemberController {

	@Autowired 
	MemberService memberService;
	
	
	
	
	/* 메인페이지 로그아웃 */
    @RequestMapping(value="/logout", method=RequestMethod.GET)  //a태그는 get방식임
    public String logoutGet(HttpServletRequest request) throws Exception{
		log.info("logoutGet");
		
    	HttpSession session = request.getSession();
    	session.invalidate();  //세션 제거 메소드 : 세션전체 무효화
    	
    	return "redirect:/main";
    	
    }
    
	// 회원가입
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String joinPOST(MemberVO memberVO) throws Exception {	
        
		log.info("join 진입");

		// 회원가입 서비스 실행
		memberService.memberJoin(memberVO);

		log.info("join Service 성공");
		return "redirect:/main";

	}
	
	  /* 로그인 */
	/*- MemberVO는 데이터를 전달받기 위해, HttpServletRequest는 로그인 성공 시 session에 회원 정보를 저장하기 위해,
	RedirectAttributes는 로그인 실패 시 리다이렉트 된 로그인 페이지에 실패를 의미하는 데이터를 전송하기 위해 사용*/
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginPOST(HttpServletRequest request, MemberVO member, RedirectAttributes rttr) throws Exception{
        
       // System.out.println("login 메서드 진입");
       // System.out.println("전달된 데이터 : " + memberVO);
    	HttpSession session = request.getSession();
    	MemberVO lvo = memberService.memberLogin(member);
    	log.info(lvo);
        
    	 if(lvo == null) { // 일치하지 않는 아이디가 없을 경우
             
             int result = 0;
             rttr.addFlashAttribute("result", result);
             return "redirect:/member/login";    
         }
         
         session.setAttribute("member", lvo); // 일치하는 아이디가 있을 경우 (로그인 성공) 세션 객체에 값저장하고 얻어오기
         return "/main";
 
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
