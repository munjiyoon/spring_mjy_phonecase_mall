package edu.kosmo.mjy;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Controller  //컨트롤러의 역할을 한다고 스프링에 선언하는 역할
@Log4j   //로그 기록
public class MainController {
	
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void mainPageGET() {
		
		log.info("mainPageGET()");
		
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String indexPageGET() {
		
		log.info("indexPageGET()");
		return "index";
	}
	
	

	
}
