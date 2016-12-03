package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import po.Article;
import po.IndexImageTop;
import dao.IArticleDao;
import dbutil.DBConn;

public class ArticleDaoImpl implements IArticleDao {
	 DBConn db=null;
	    public ArticleDaoImpl(){
	    	db=new DBConn();
	    }
	public List<Article> findall() {
		List<Article> entities = new ArrayList<Article>();
		String sql="select * from article order by articleid desc   limit 0,4";
		ResultSet rs=db.execQuery1(sql);
		 try {
			while (rs.next()) {
				Article i=new Article();
				i.setArticleid(rs.getInt("articleid"));
				i.setArticleimageurl(rs.getString("articleimageurl"));
				i.setArticletitle(rs.getString("articletitle"));
				i.setArticlepre(rs.getString("articlepre"));
				i.setArticledate(rs.getString("Articledate"));
				entities.add(i);
				
			 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entities;
	}

	public List<Article> findby(int articleid) {
		List<Article> entities = new ArrayList<Article>();
		String sql="select * from article where articleid=?";
		ResultSet rs=db.execQuery(sql,new Object[]{articleid});
		 try {
			while (rs.next()) {
				Article i=new Article();
				i.setArticleid(rs.getInt("articleid"));
				i.setArticleimageurl(rs.getString("articleimageurl"));
				i.setArticletitle(rs.getString("articletitle"));
				i.setArticlepre(rs.getString("articlepre"));
				i.setArticledate(rs.getString("Articledate"));
				i.setArticlecontent(rs.getString("articlecontent"));
				entities.add(i);
				
			 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entities;
	}

	public Article add(String articleimageurl, String articletitle,
			String articlepre, String articledate, String articlecontent) {
		String sql="insert into article(articleimageurl,articletitle,articlepre,articledate,articlecontent)values(?,?,?,?,?)";
		db.executeUpdate(sql, new Object[]{articleimageurl,articletitle,articlepre,articledate,articlecontent});
		return null;
	}

}
