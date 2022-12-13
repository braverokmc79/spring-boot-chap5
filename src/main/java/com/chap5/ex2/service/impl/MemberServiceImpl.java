package com.chap5.ex2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chap5.ex2.model.dao.mapper.MemberMapper;
import com.chap5.ex2.model.vo.MemberVO;
import com.chap5.ex2.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public MemberVO getMember(MemberVO memberVo) throws Exception {
		return memberMapper.getMember(memberVo);
	}
	
	
	@Override
	public List<MemberVO> getAllMember() throws Exception{
		return memberMapper.getAllMember();
	}

	@Override
	public int deleteMember(String id) throws Exception{
		return memberMapper.deleteMember(id);		
	}

	@Override
	public int addMember(MemberVO member) throws Exception{
		return memberMapper.addMember(member);		
	}

	
	
	
}