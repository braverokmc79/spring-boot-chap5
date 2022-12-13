package com.chap5.ex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() throws Exception{		
		return "index";
	}
	
}
