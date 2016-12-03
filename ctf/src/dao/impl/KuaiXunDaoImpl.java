package dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import po.KuaiXun;
import po.Vote;
import dao.IKuaiXunDao;
import dbutil.DBConn;

public class KuaiXunDaoImpl implements IKuaiXunDao {
	 DBConn db=null;
	    public KuaiXunDaoImpl(){
	    	db=new DBConn();
	    }
		
	public List<KuaiXun> Find() {
		String sql="select * from kuaixun order by kxid desc limit 0,6";
		ResultSet rs=db.execQuery1(sql);
		  List<KuaiXun>list=new ArrayList<KuaiXun>();
		  try {
			  while(rs.next())
		        {
		       	  KuaiXun kuaiXun=new KuaiXun();
		       	 kuaiXun.setKxid(rs.getInt("kxid"));
		       	 kuaiXun.setKxtitle(rs.getString("kxtitle"));
		       	 kuaiXun.setKxurl(rs.getString("kxurl"));
		       	  list.add(kuaiXun);
		       	 
		        }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public KuaiXun addKuaiXun(String kxtitle, String kxurl) {
		String sql="insert into kuaixun(kxtitle,kxurl) values(?,?)";
		db.executeUpdate(sql, new Object[]{kxtitle,kxurl});
		return null;
	}

}
