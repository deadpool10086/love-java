package dao;



import java.util.List;


import po.Learn;


public interface ILearnDao {
	
	public List<Learn> Find(int learnid);
	public Integer getCountRecord();
	    //根据当前页到结束页的查询
	public     List<Learn> findIimitPage(Integer newPage);
	    //总的页数
	  public  Integer getCountPage();
	  
	  public Learn Add(String learntitle,String learncontentpre,String learncontent,String learndate);

}
