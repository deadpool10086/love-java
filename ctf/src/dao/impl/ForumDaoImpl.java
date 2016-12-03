package dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import po.Forum;
import po.Learn;
import dao.IForumDao;
import dbutil.DBConn;

public class ForumDaoImpl implements IForumDao {
	private static final Integer pageSize = 15;
	 private Integer countRecord;// 共有多少条记录
	private Integer countPage;// 共有多少页
	 DBConn db=null;
	    public ForumDaoImpl(){
	    	db=new DBConn();
	    }
	public List<Forum> Find(int forumid) {
		 List<Forum> entities = new ArrayList<Forum>();
		 String sql = "select * from forum where forumid=?";
		 try {
			
			 ResultSet rs=db.execQuery(sql, new Object[]{forumid});
			  while (rs.next()) {
				  Forum rorum=new Forum();
			         rorum.setForumid(rs.getInt("forumid"));
			         rorum.setFcontent(rs.getString("fcontent"));
			         rorum.setFdate(rs.getString("fdate"));
			         rorum.setFtitle(rs.getString("ftitle"));
			         rorum.setMembername(rs.getString("membername"));
			           entities.add(rorum);
		        }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return entities;
	}

	public Integer getCountRecord() {
		 Integer count = 0;
		    // 获取连接
		    // 定义sql语句 查询出一共的记录条数
		    String sql = "select count(*) as con from forum";
		    ResultSet rs=db.execQuery1(sql);
		    try {
		    	if (rs.next()) {
			           count = rs.getInt("con");
			        }
		    	 this.countPage = ((count % pageSize) != 0 ? (count / pageSize + 1) : (count / pageSize));
			} catch (Exception e) {
				e.printStackTrace();
			}
		    
		return countPage;
	}

	public List<Forum> findIimitPage(Integer newPage) {
		 List<Forum> entities = new ArrayList<Forum>();
		 String sql = "select * from forum limit ?,?";
		 try {
			
			 ResultSet rs=db.execQuery(sql, new Object[]{(newPage - 1) * pageSize,pageSize});
			  while (rs.next()) {
		           Forum rorum=new Forum();
		         rorum.setForumid(rs.getInt("forumid"));
		         rorum.setFcontent(rs.getString("fcontent"));
		         rorum.setFdate(rs.getString("fdate"));
		         rorum.setFtitle(rs.getString("ftitle"));
		         rorum.setMembername(rs.getString("membername"));
		           entities.add(rorum);
		        }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return entities;
	}

	public Integer getCountPage() {
		 return countPage;
	}

	public Learn Add(String ftitle, String membername, String fdate,
			String fcontent) {
		String sql="insert into forum(ftitle,membername,fdate,fcontent) values(?,?,?,?) ";
		db.executeUpdate(sql, new Object[]{ftitle,membername,fdate,fcontent});
		return null;
	}

}
