package dao;

import java.util.List;

import po.Forum;
import po.Lcomment;
import po.Learn;

public interface IForumDao {
	public List<Forum> Find(int forumid);
	public Integer getCountRecord();
	    //根据当前页到结束页的查询
	public     List<Forum> findIimitPage(Integer newPage);
	    //总的页数
	  public  Integer getCountPage();
	  
	  public Learn Add(String ftitle,String membername,String fdate,String fcontent);
}
