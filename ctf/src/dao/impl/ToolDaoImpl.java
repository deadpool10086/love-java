package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import po.IndexImageTop;
import po.Tool;
import dao.IToolDao;
import dbutil.DBConn;

public class ToolDaoImpl implements IToolDao {
	  DBConn db=null;
	    public ToolDaoImpl(){
	    	db=new DBConn();
	    }
	public List<Tool> findall() {
		List<Tool> entities = new ArrayList<Tool>();
		String sql="select * from tool order by toolid desc   limit 0,3";
		ResultSet rs=db.execQuery1(sql);
		 try {
			while (rs.next()) {
				Tool t=new Tool();
				t.setToolid(rs.getInt("toolid"));
				t.setToolimageurl(rs.getString("toolimageurl"));
				t.setTooltitle(rs.getString("tooltitle"));
				
				entities.add(t);
				
			 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return entities;
		
	}

	public List<Tool> findby(int toolid) {
		List<Tool> entities = new ArrayList<Tool>();
		String sql="select * from tool where toolid=?";
		 try {
			
			 ResultSet rs=db.execQuery(sql, new Object[]{toolid});
			  while (rs.next()) {
				  Tool t=new Tool();
					t.setToolid(rs.getInt("toolid"));
					t.setToolimageurl(rs.getString("toolimageurl"));
					t.setTooltitle(rs.getString("tooltitle"));
					t.setToolcontent(rs.getString("toolcontent"));
					entities.add(t);
		        }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return entities;
		
	}

	public Tool add(String toolimageurl, String tooltitle, String tooldate,
			String toolcontent) {
		String sql="insert into tool(toolimageurl,tooltitle,tooldate,toolcontent)values(?,?,?,?)";
		db.executeUpdate(sql,new Object[]{toolimageurl,tooltitle,tooldate,toolcontent});
		return null;
	}

}
