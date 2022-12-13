package com.chap5.ex2.service;

import java.util.List;

import com.chap5.ex2.model.vo.MemberVO;

public interface MemberService {
	
	public MemberVO getMember(MemberVO memberVo) throws Exception;
	
	public List<MemberVO> getAllMember() throws Exception;

	public int deleteMember(String id) throws Exception;

	public int addMember(MemberVO member) throws Exception;

	
	
}