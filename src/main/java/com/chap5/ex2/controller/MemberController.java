package com.chap5.ex2.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chap5.ex2.model.vo.MemberVO;
import com.chap5.ex2.service.MemberService;

@Controller
@RequestMapping("/ex2")
public class MemberController {

	@Autowired
	private MemberService memberService;


	@GetMapping("/member/addForm")
	public String addForm() throws Exception{
		return "ex2/member/addForm";
	}

	@PostMapping("/member/add")
	public String add(Model model, MemberVO member) throws Exception {
		memberService.addMember(member);
		return "redirect:listMembers";
	}

	@PostMapping("/member/delete")
	public String deleteMember(Model model, HttpServletRequest request) throws Exception {
		memberService.deleteMember(request.getParameter("id"));
		return "redirect:list";
	}


	@GetMapping(value = "/member/listMembers")
	public String listMembers(Model model) throws Exception {
		List<MemberVO> members = memberService.getAllMember();
		model.addAttribute("members", members);
		return "ex2/member/listMembers";
	}

	
	@GetMapping(value = "/login")
	public String loginForm(Model model) throws Exception {	
		return "ex2/login";
	}

	
	@PostMapping(value = "/login")
	public String login(MemberVO memberVo, RedirectAttributes rttr, HttpSession session, Model model) throws Exception {
		MemberVO  memberInfo =memberService.getMember(memberVo);
		if(memberInfo==null) {
			rttr.addFlashAttribute("loginError","error");
			return "redirect:login";
		}
		session.setAttribute("LoginInfo", memberInfo);		
		return "redirect:list";
	}
	
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();		
		return "redirect:list";
	}
	
	
	
}