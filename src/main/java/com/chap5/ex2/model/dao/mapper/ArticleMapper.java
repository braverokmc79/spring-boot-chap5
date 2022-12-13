package com.chap5.ex2.model.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.chap5.ex2.model.vo.ArticleVO;

@Mapper
@Repository
public interface ArticleMapper {

	public List<ArticleVO> listArticle() throws Exception;
	
	public int writeArticle(ArticleVO articleVO) throws Exception;
	
	public ArticleVO getArticle(Integer aid) throws Exception;;
	
	public int updateCntArticle(Integer articleNo) throws Exception;
	
	public int updateArticle(ArticleVO articleVO) throws Exception;
	
	public int deleteArticle(ArticleVO articleVO) throws Exception;

	public int writeArticleContent(ArticleVO articleVO) throws Exception;

	public int updateArticleContent(ArticleVO articleVO) throws Exception;
	
	
}
