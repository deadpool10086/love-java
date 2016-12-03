package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Member;

import com.opensymphony.xwork2.ActionSupport;

import dao.IMemberDao;
import dao.impl.MemberDaoImpl;

public class MemberInfoEditAction extends ActionSupport {
	private static final long serialVersionUID=1L;
	  
	
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
     private String membername=request.getSession().toString();
     private String membername1=request.getSession().getAttribute("info").toString();
     private String memberpassword;
     private String qq;
     private String phone;
     private String address;
   
     @Override
     public String execute() throws Exception
     {
    	 
    	 IMemberDao memberDao=new MemberDaoImpl();
 		 Member member=new Member();
 		
        	 member=memberDao.EditUser(memberpassword, qq, phone, address, membername1);
        	
      			
      		return SUCCESS;
      			
        	
     	  
			
		
         
     }

	

	public String getMemberpassword() {
		return memberpassword;
	}

	public void setMemberpassword(String memberpassword) {
		this.memberpassword = memberpassword;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    	 
    	 
    	 
    	 
    	 
    	 
        
         
         
 		
 		
     


	
}
