package com.ezen.koh2;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/")
	public String start() {
		
		return "main";
	}
	
	@RequestMapping(value = "/out")
	public String out(Model mo) {
		Service ss = sqlSession.getMapper(Service.class);
		ArrayList<ScoreDTO> list = ss.print();
		mo.addAttribute("list", list);
		
		return "out";
	}
	
}
