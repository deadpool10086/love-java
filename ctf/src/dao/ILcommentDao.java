package dao;

import java.util.List;

import po.Lcomment;



public interface ILcommentDao {
	
	public List<Lcomment> Find(int learnid);
	
	  public Lcomment Add(String membername,String lcdate,String lcomment,int learnid);
}
