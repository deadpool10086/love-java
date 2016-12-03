package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import po.Vote;

import com.opensymphony.xwork2.ActionSupport;

public class FindCountAction extends ActionSupport {
	private static final long serialVersionUID=1L;
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	public String execute()throws Exception{
		try {
			Class.forName("com.mysql.jdbc.Driver");
	         String url="jdbc:mysql://localhost:3306/vote";
	         String username="stoical";
	         String password="123456";
	         Connection con=DriverManager.getConnection(url,username,password);
	         Statement stmt=con.createStatement();
	         String sql="SELECT *, COUNT(voteforname) AS count FROM vote group by  voteforname";
	         ResultSet rs=stmt.executeQuery(sql);
	         List<Vote>list2=new ArrayList<Vote>();
	         List ints = new ArrayList();
	         List nameList=new ArrayList();
	        
	         while(rs.next())
	         {
	        	  Vote vote=new Vote();
	        	  vote.setId(rs.getInt("voteid"));
	        	 vote.setVoteforname(rs.getString("voteforname"));
	        	  vote.setMembername(rs.getString("membername"));
	        	  vote.setIp(rs.getString("ip"));
	        	  vote.setTime(rs.getString("time"));
	        	  int s=  rs.getInt("count");
	        	  String ss=rs.getString("voteforname");
	        	  list2.add(vote);
	        	  nameList.add(ss);
	        	  ints.add(s);
	        	 
	         }
	         request.setAttribute("list2", list2);
	         request.setAttribute("ints", ints);
	         request.setAttribute("nameList", nameList);
	         rs.close();
	         stmt.close();
	         con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
		
		
	}

}
