package com.chap5.ex2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chap5.ex2.model.vo.ArticleVO;
import com.chap5.ex2.model.vo.MemberVO;
import com.chap5.ex2.service.ArticleService;


@Controller
@RequestMapping("/ex2")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	
	@GetMapping("/list")
	public String listArticle(Model model) throws Exception{	
		model.addAttribute("list", articleService.listArticle()) ;
		return "ex2/list";
	}
	
	
	@GetMapping("/write")
	public String writeArticle() throws Exception{		
		return "ex2/write";
	}
	
	@PostMapping("/write")
	public String writeArticle(HttpSession session, ArticleVO articleVO) throws Exception{		
		MemberVO memberInfo=(MemberVO)session.getAttribute("LoginInfo");
		articleVO.setWriter(memberInfo.getId());
		articleService.writeArticle(articleVO);
		return "redirect:list";
	}
	
	

	
	@GetMapping("/read")
	public String readArticle(Integer aid, Model model) throws Exception{
		ArticleVO articleVO=articleService.getArticle(aid);
		model.addAttribute("articleVO", articleVO);
		return "ex2/read";
	}
	
	
	@GetMapping("/update")
	public String updateFormArticle(HttpSession session, Model model, @RequestParam Integer aid ) throws Exception{	
		if(session.getAttribute("LoginInfo")==null) {
			model.addAttribute("msg","error");
			return "ex2/update";
		}		
		MemberVO memberVO=(MemberVO)session.getAttribute("LoginInfo");
		ArticleVO articleVO=articleService.getArticle(aid);
		if(memberVO.getId()!=articleVO.getWriter()) {
			model.addAttribute("msg","error");
			return "ex2/update";
		}
		
		model.addAttribute("articleVO", articleVO);
		return "ex2/update";
	}
	
	
	@PostMapping("/update")
	public String updateArticle(HttpSession session,  Model model ,ArticleVO articleVO) throws Exception{	
		if(session.getAttribute("LoginInfo")==null) return "redirect:list";
		MemberVO memberVO=(MemberVO)session.getAttribute("LoginInfo");
		articleVO.setWriter(memberVO.getId());
		articleService.updateArticle(articleVO);
		model.addAttribute("msg","success");
		return "ex2/update";
	}
	
	
	@RequestMapping("/delete")
	public String deleteArticle(HttpSession session,  Model model, @RequestParam Integer aid ) throws Exception{				
		if(session.getAttribute("LoginInfo")==null) {
			model.addAttribute("msg","error");
			return "ex2/delete";
		}		
		MemberVO memberVO=(MemberVO)session.getAttribute("LoginInfo");
		ArticleVO articleVO=articleService.getArticle(aid);
		if(memberVO.getId()!=articleVO.getWriter()) {
			model.addAttribute("msg","error");
			return "ex2/delete";
		}
		
		articleVO.setWriter(memberVO.getId());
		articleService.deleteArticle(articleVO);
		model.addAttribute("msg","success");
		return  "ex2/delete";
	}
	
	
	
}
