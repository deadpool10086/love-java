package action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import po.Vote;

import com.opensymphony.xwork2.ActionSupport;

public class FindAction extends ActionSupport  {
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
        String sql="select * from vote";
        ResultSet rs=stmt.executeQuery(sql);
        List<Vote>list=new ArrayList<Vote>();
        while(rs.next())
        {
       	  Vote vote=new Vote();
       	  vote.setId(rs.getInt("voteid"));
       	  vote.setVoteforname(rs.getString("voteforname"));
       	  vote.setMembername(rs.getString("membername"));
       	  vote.setIp(rs.getString("ip"));
       	  vote.setTime(rs.getString("time"));
       	  list.add(vote);
       	 
        }
        request.setAttribute("list", list);
        rs.close();
        stmt.close();
        con.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return SUCCESS;
	

}

}
