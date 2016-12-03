package dao.impl;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import po.Learn;
import po.Member;
import dao.ILearnDao;
import dbutil.DBConn;

public class LearnDaoImpl implements ILearnDao {
	private static final Integer pageSize = 8;
	 private Integer countRecord;// 共有多少条记录
	private Integer countPage;// 共有多少页
	 DBConn db=null;
	    public LearnDaoImpl(){
	    	db=new DBConn();
	    }
	public List<Learn> Find() {
		
		return null;
	}

	public Integer getCountRecord() {
		 Integer count = 0;
		    // 获取连接
		    // 定义sql语句 查询出一共的记录条数
		    String sql = "select count(*) as con from learn";
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

	public List<Learn> findIimitPage(Integer newPage) {
		 List<Learn> entities = new ArrayList<Learn>();
		 String sql = "select * from learn order by learnid desc limit ?,?";
		 try {
			
			 ResultSet rs=db.execQuery(sql, new Object[]{(newPage - 1) * pageSize,pageSize});
			  while (rs.next()) {
		           Learn entity = new Learn();
		           entity.setLearnid(rs.getInt("learnid"));
		           entity.setLearntitle(rs.getString("learntitle"));
		           entity.setLearncontentpre(rs.getString("learncontentpre"));
		           entity.setLearndate(rs.getString("learndate"));
		           entities.add(entity);
		        }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return entities;
	}

	public Integer getCountPage() {
		
		 return countPage;
	}
	public Learn Add(String learntitle, String learncontentpre,
			String learncontent, String learndate) {
		  String sql="insert into learn(learntitle,learncontentpre,learncontent,learndate)values(?,?,?,?)";
			
			//step3:��ȡ��ѯ���
			
			Learn learn=new Learn();
			db.executeUpdate(sql, new Object[]{learntitle,learncontentpre,learncontent,learndate});
			//step4:����Usersʵ�������
			
			return learn;
		
	}
	public List<Learn> Find(int learnid) {
		 List<Learn> entities = new ArrayList<Learn>();
		 String sql = "select * from learn where learnid=?";
		 try {
			
			 ResultSet rs=db.execQuery(sql, new Object[]{learnid});
			  while (rs.next()) {
		           Learn entity = new Learn();
		           entity.setLearnid(rs.getInt("learnid"));
		           entity.setLearntitle(rs.getString("learntitle"));
		           entity.setLearncontentpre(rs.getString("learncontentpre"));
		           entity.setLearncontent(rs.getString("learncontent"));
		           entity.setLearndate(rs.getString("learndate"));
		           entities.add(entity);
		        }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return entities;
	}

}
