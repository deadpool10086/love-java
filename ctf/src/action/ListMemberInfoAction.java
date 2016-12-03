package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.Else;
import org.apache.struts2.components.If;

import po.Member;
import po.Question;
import po.Vote;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.IMemberDao;
import dao.impl.MemberDaoImpl;

public class ListMemberInfoAction extends ActionSupport {

	private static final long serialVersionUID=1L;
	
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
     private String membername=request.getSession().toString();
     private String membername1=request.getSession().getAttribute("info").toString();
	
	public String execute()throws Exception{
		ActionContext context=ActionContext.getContext();
		if(context.getSession().isEmpty())
		{
			return ERROR;
		}
			else
			{
				
		try {
			 IMemberDao memberDao=new MemberDaoImpl();
	 		 Member member=new Member();
	 		
	    	 Class.forName("com.mysql.jdbc.Driver");
	         String url="jdbc:mysql://localhost:3306/ctf";
	         String username="ctf";
	         String password="ctf123";
	         Connection con=DriverManager.getConnection(url,username,password);
	        // Statement stmt=con.createStatement();
	         String sql="select * from member where membername=?";
	         PreparedStatement ps=con.prepareStatement(sql);
	         ps.setString(1, membername1);
	         
	         ResultSet rs=ps.executeQuery();
	        
	      
	        List<Member>memberlist=new ArrayList<Member>();
	        
	      
	        while(rs.next())
	        {
	       	  
	       	 
	       	  Member member2 =new Member();
	       	  member2.setMembername(rs.getString("membername"));
	       	  member2.setMemberpassword(rs.getString("memberpassword"));
	       	  member2.setQq(rs.getString("qq"));
	       	  member2.setPhone(rs.getString("phone"));
	       	  member2.setAddress(rs.getString("address"));
	       	  
	       
	       	  
	       	  memberlist.add(member2);
	       	 
	        }
	        
	       
	        
	       
	        request.setAttribute("memberlist", memberlist);
	       
	       
	        rs.close();
	       // stmt.close();
	        con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
		

	}
	
	
	
	}
}

	
