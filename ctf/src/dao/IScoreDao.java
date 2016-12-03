package dao;

import po.Score;

public interface IScoreDao {

	public Score Add(String membername,int questionid,Double score);
	
}
