package dao;

import po.News;
import po.Score;

public interface INewsDao {

	public News Add(String newstime,String newscontent);
	
}
