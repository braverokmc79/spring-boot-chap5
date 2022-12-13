package com.chap5.ex2.model.vo;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ArticleVO extends ArticleContentVO {

	private int articleNo;
	private int writer;
	private String name;
	private String title;	
	private int readCnt;
	private Timestamp  regdate;
	private Timestamp  moddate;
	
	
}


