package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;





import po.Admin;
import dao.IUserDao;
import dbutil.DBConn;

public class UserDaoImpl implements IUserDao {
    
	    DBConn db=null;
	    public UserDaoImpl(){
	    	db=new DBConn();
	    }
	
	public Admin UserLoginCheck(String usn, String pwd) {
    String sql="SELECT * FROM admin where adminname=? and adminpassword=?";
		
		//step3:��ȡ��ѯ���
		ResultSet rs=db.execQuery(sql, new Object[]{usn,pwd});
		//step4:����Usersʵ�������
		Admin admin=new Admin();
		try {
			//step5:��ȡ������
			if(rs.next()){
			    admin.setAdminname(rs.getString("adminname"));
			    admin.setAdminpassword(rs.getString("adminpassword"));
				return admin;	
			}else{
				return null;
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block		
			e.printStackTrace();
			return null;
		} finally{
			db.closeConn();
		}		
		
	}

	
	public Admin FindByuid(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int RegisterUser(Admin admin) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public int UpdateUser(Admin admin) {
		// TODO Auto-generated method stub
		return 0;
	}

}
