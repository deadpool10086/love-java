package dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import po.Fcomment;
import po.Lcomment;
import po.Member;
import dao.IFcommentDao;
import dbutil.DBConn;

public class FcommentDaoImpl implements IFcommentDao {
	 DBConn db=null;
	    public FcommentDaoImpl(){
	    	db=new DBConn();
	    }
	public List<Fcomment> Find(int forumid) {
		 List<Fcomment> entities = new ArrayList<Fcomment>();
		 String sql = "select * from fcomment where forumid=? order by fcdate desc";
		 try {
				
			 ResultSet rs=db.execQuery(sql,new Object[]{forumid});
			  while (rs.next()) {
		           Fcomment fcomment=new Fcomment();
		           fcomment.setMembername(rs.getString("membername"));
		           fcomment.setFcdate(rs.getString("Fcdate"));
		           fcomment.setFcomment(rs.getString("fcomment"));
		           fcomment.setFcommentid(rs.getInt("fcommentid"));
		           fcomment.setForumid(rs.getInt("forumid"));
		         
		           
		           entities.add(fcomment);
		        }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return entities;
		
	}
	public Fcomment Add(String membername, String fcdate, String fcomment,
			int forumid) {
		String sql="insert into fcomment(membername,fcdate,fcomment,forumid) values(?,?,?,?)";
		db.executeUpdate(sql, new Object[]{membername,fcdate,fcomment,forumid});
		return null;
	}


	

}
