package com.chap5.ex2.model.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MemberVO {

	int id;
	String email;
	String password;
	String name;
	String regdate;
}

