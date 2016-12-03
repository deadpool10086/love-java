package dao.impl;

import po.Score;

import dao.IScoreDao;
import dbutil.DBConn;

public class ScoreDaoImpl implements IScoreDao {
	 DBConn db=null;
	    public ScoreDaoImpl(){
	    	db=new DBConn();
	    }
	public Score Add(String membername, int questionid, Double score) {
		Score score1=new Score();
	   
			String sql="insert into score(membername,questionid,score)values(?,?,?)";
	        db.executeUpdate(sql, new Object[]{membername,questionid,score});
		
		return score1;
	}

}
