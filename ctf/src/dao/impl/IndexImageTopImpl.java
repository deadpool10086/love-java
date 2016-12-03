package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

import po.IndexImageTop;
import po.Learn;
import dao.IIndexImageTop;
import dbutil.DBConn;

public class IndexImageTopImpl implements IIndexImageTop {
	    DBConn db=null;
	    public IndexImageTopImpl(){
	    	db=new DBConn();
	    }
	public List<IndexImageTop> findall() {
		List<IndexImageTop> entities = new ArrayList<IndexImageTop>();
		String sql="select * from indeximagetop order by indeximagetopid desc   limit 0,5";
		ResultSet rs=db.execQuery1(sql);
		 try {
			while (rs.next()) {
				IndexImageTop i=new IndexImageTop();
				i.setIndeximagetopid(rs.getInt("indeximagetopid"));
				i.setIndeximagetopurl(rs.getString("indeximagetopurl"));
				i.setIndeximagetoptitle(rs.getString("indeximagetoptitle"));
				entities.add(i);
				
			 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entities;
	}

	public List<IndexImageTop> findby(int indeximagetopid) {
		 List<IndexImageTop> entities = new ArrayList<IndexImageTop>();
		 String sql = "select * from indeximagetop where indeximagetopid=?";
		 try {
			
			 ResultSet rs=db.execQuery(sql, new Object[]{indeximagetopid});
			  while (rs.next()) {
					IndexImageTop i=new IndexImageTop();
					i.setIndeximagetopid(rs.getInt("indeximagetopid"));
					i.setIndeximagetopurl(rs.getString("indeximagetopurl"));
					i.setIndeximagetoptitle(rs.getString("indeximagetoptitle"));
					i.setIndeximagecontent(rs.getString("indeximagecontent"));
					entities.add(i);
		        }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return entities;
		
	}

	public IndexImageTop add(String indeximagetopurl,
			String indeximagetoptitle, String indeximagetopdate,
			String indeximagecontent) {
		String sql="insert into indeximagetop(indeximagetopurl,indeximagetoptitle,indeximagetopdate,indeximagecontent)values(?,?,?,?)";
		db.executeUpdate(sql, new Object[]{indeximagetopurl,indeximagetoptitle,indeximagetopdate,indeximagecontent});
		return null;
	}

}
