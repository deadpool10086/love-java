package dao;

import java.util.List;

import po.Article;


public interface IArticleDao {
	public List<Article> findall();
	public List<Article> findby(int articleid);
	public Article add(String articleimageurl,String articletitle,String articlepre,String articledate,String articlecontent );
 
}
