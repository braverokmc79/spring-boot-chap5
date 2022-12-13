package com.chap5.ex2.model.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.chap5.ex2.model.vo.MemberVO;

@Mapper
@Repository
public interface MemberMapper {
	
	public MemberVO getMember(MemberVO memberVo) throws Exception;
	
	public List<MemberVO> getAllMember() throws Exception;

	public int deleteMember(String id) throws Exception;

	public int addMember(MemberVO member) throws Exception;

}