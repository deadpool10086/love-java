package dao;

import java.util.List;

import po.Train;



public interface ITrainDao {
	public List<Train> Find(int trainid);
	public Integer getCountRecord();
	    //根据当前页到结束页的查询
	public     List<Train> findIimitPage(Integer newPage);
	    //总的页数
	  public  Integer getCountPage();
	  
	  public Train Add(String traintitle,String traintype,String traindate,String traincontent);
}
