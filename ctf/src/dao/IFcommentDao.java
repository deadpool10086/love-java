package dao;

import java.util.List;

import po.Fcomment;





public interface IFcommentDao {
	
	public List<Fcomment> Find(int forumid);
	
	  public Fcomment Add(String membername,String fcdate,String fcomment,int forumid);
}
