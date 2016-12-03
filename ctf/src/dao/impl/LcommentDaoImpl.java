package dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import po.Lcomment;
import po.Learn;
import po.Member;
import dao.ILcommentDao;
import dbutil.DBConn;

public class LcommentDaoImpl implements ILcommentDao {
	 DBConn db=null;
	    public LcommentDaoImpl(){
	    	db=new DBConn();
	    }
	public List<Lcomment> Find(int learnid) {
		 List<Lcomment> entities = new ArrayList<Lcomment>();
		 String sql = "select * from lcomment where learnid=? order by lcdate desc";
		 try {
				
			 ResultSet rs=db.execQuery(sql,new Object[]{learnid});
			  while (rs.next()) {
		           Lcomment lcomment=new Lcomment();
		           lcomment.setMembername(rs.getString("membername"));
		           lcomment.setLcdate(rs.getString("lcdate"));
		           lcomment.setLcomment(rs.getString("lcomment"));
		           
		           entities.add(lcomment);
		        }
		} catch (Exception e) {
			// TODO: handle exception
		}
		 return entities;
		
	}

	public Lcomment Add(String membername, String lcdate, String lcomment,
			int learnid) {
		 String sql="insert into lcomment(membername,lcdate,lcomment,learnid)values(?,?,?,?)";
			
			//step3:��ȡ��ѯ���
			
			Lcomment lcomment2=new Lcomment();
			db.executeUpdate(sql, new Object[]{membername,lcdate,lcomment,learnid});
			//step4:����Usersʵ�������
			
			return lcomment2;
		
	}

}
