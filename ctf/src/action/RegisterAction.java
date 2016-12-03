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

public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID=1L;
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response=ServletActionContext.getResponse();
     private String membername;
     private String memberpassword;
     private String qq;
     private String phone;
     private String address;
   
     @Override
     public String execute() throws Exception
     {
    	 
    	 IMemberDao memberDao=new MemberDaoImpl();
 		 Member member=new Member();
 		
    	 Class.forName("com.mysql.jdbc.Driver");
         String url="jdbc:mysql://localhost:3306/ctf";
         String username="ctf";
         String password="ctf123";
         Connection con=DriverManager.getConnection(url,username,password);
        // Statement stmt=con.createStatement();
         String sql="select membername from member where membername=?";
         PreparedStatement ps=con.prepareStatement(sql);
         ps.setString(1, membername);
         
         ResultSet rs=ps.executeQuery();
        
         
         
         if(rs.next())
         {
        	 response.setContentType("text/html;charset=gb2312"); 
     		response.getWriter().printf("<script>alert('用户名已经存在!');location.href='register.jsp'</script>");
        	 System.out.print("heh");
        	 return ERROR;
        	 
         }
         else {
        	 
        	 member=memberDao.RegisterUser(membername, memberpassword,qq,phone,address);
        	 response.setContentType("text/html;charset=gb2312"); 
     		 response.getWriter().printf("<script>alert('successful!');location.href='login.jsp'</script>");
        	
      			
      		return SUCCESS;
      			
        	
     	  
			}
			
         
     }

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
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
