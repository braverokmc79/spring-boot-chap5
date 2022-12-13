package com.chap5.ex2.service;

import java.util.List;

import com.chap5.ex2.model.vo.ArticleVO;

public interface ArticleService {
	
	
	public List<ArticleVO> listArticle() throws Exception;
	
	public int writeArticle(ArticleVO articleVO) throws Exception;
	
	public ArticleVO getArticle(Integer aid) throws Exception;;
	
	public int updateCntArticle(Integer articleNo) throws Exception;
	
	public int updateArticle(ArticleVO articleVO) throws Exception;
	
	public int deleteArticle(ArticleVO articleVO) throws Exception;
	
	
	
}