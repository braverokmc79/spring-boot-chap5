package com.chap5.ex2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chap5.ex2.model.dao.mapper.ArticleMapper;
import com.chap5.ex2.model.vo.ArticleVO;
import com.chap5.ex2.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleMapper articeMapper;

	@Override
	public List<ArticleVO> listArticle() throws Exception {
		return articeMapper.listArticle();
	}

	@Transactional
	@Override
	public int writeArticle(ArticleVO articleVO) throws Exception {
		articeMapper.writeArticle(articleVO);			
		return articeMapper.writeArticleContent(articleVO);
	}
	
	
	@Transactional
	@Override
	public ArticleVO getArticle(Integer aid) throws Exception {
		articeMapper.updateCntArticle(aid);
		return articeMapper.getArticle(aid);
	}

	@Override
	public int updateCntArticle(Integer articleNo) throws Exception {
		return articeMapper.updateCntArticle(articleNo);
	}
	
	
	@Transactional
	@Override
	public int updateArticle(ArticleVO articleVO) throws Exception {		
		articeMapper.updateArticle(articleVO);
		return articeMapper.updateArticleContent(articleVO);
	}

	@Override
	public int deleteArticle(ArticleVO articleVO) throws Exception {
		return articeMapper.deleteArticle(articleVO);
	}


	
	
}
