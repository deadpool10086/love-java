package dao;

import java.util.List;

import po.IndexImageTop;

public interface IIndexImageTop {
	public List<IndexImageTop> findall();
	public List<IndexImageTop> findby(int indeximagetopid);
	public IndexImageTop add(String indeximagetopurl,String indeximagetoptitle,String indeximagetopdate,String indeximagecontent );
 
}
