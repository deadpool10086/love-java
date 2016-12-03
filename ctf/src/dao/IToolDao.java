package dao;

import java.util.List;

import po.IndexImageTop;
import po.Tool;

public interface IToolDao {
	public List<Tool> findall();
	public List<Tool> findby(int toolid);
	public Tool add(String toolimageurl,String tooltitle,String tooldate,String toolcontent );
 
}
