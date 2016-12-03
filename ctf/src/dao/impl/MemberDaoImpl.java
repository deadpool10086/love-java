package dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import po.Admin;
import po.Member;
import dao.IMemberDao;
import dbutil.DBConn;

public class MemberDaoImpl implements IMemberDao {

    DBConn db=null;
    public MemberDaoImpl(){
    	db=new DBConn();
    }
	
	public Member UserLoginCheck(String usn, String pwd) {
String sql="SELECT * FROM member where membername=? and memberpassword=?";
		
		//step3:��ȡ��ѯ���
		ResultSet rs=db.execQuery(sql, new Object[]{usn,pwd});
		//step4:����Usersʵ�������
		Member member=new Member();
		try {
			//step5:��ȡ������
			if(rs.next()){
			   member.setMembername(rs.getString("membername"));
			   member.setMemberpassword(rs.getString("memberpassword"));
			   return member;
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

	
	public Member FindByuid(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Member RegisterUser(String membername,String memberpassword,String qq,String phone,String address) {
		
     String sql="insert into member(membername,memberpassword,qq,phone,address)values(?,?,?,?,?)";
		
		//step3:��ȡ��ѯ���
		
		Member member=new Member();
		db.executeUpdate(sql, new Object[]{membername,memberpassword,qq,phone,address});
		//step4:����Usersʵ�������
		
		return member;
		
	}
	
	public Member EditUser(String memberpassword,String qq,String phone,String address,String membername) {
		
	     String sql="update member set memberpassword=?,qq=?,phone=?,address=? where membername=?";
			
			//step3:��ȡ��ѯ���
			
			Member member=new Member();
			db.executeUpdate(sql, new Object[]{memberpassword,qq,phone,address,membername});
			//step4:����Usersʵ�������
			
			return member;
			
		}

	
	public int UpdateUser(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

}
