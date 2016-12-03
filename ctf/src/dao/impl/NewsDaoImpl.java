package dao.impl;

import po.News;
import po.Score;

import dao.INewsDao;
import dao.IScoreDao;
import dbutil.DBConn;

public class NewsDaoImpl implements INewsDao {
	 DBConn db=null;
	    public NewsDaoImpl(){
	    	db=new DBConn();
	    }
	public News Add(String newstime, String newscontent) {
		News news=new News();
	   
			String sql="insert into news(newstime,newscontent)values(?,?)";
	        db.executeUpdate(sql, new Object[]{newstime,newscontent});
		
		return news;
	}

}
