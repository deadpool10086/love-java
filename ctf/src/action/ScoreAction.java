package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import po.Score;
import po.Vote;

import com.opensymphony.xwork2.ActionSupport;

public class ScoreAction extends ActionSupport {

	private static final long serialVersionUID=1L;
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	public String execute()throws Exception{
		try {
			 Class.forName("com.mysql.jdbc.Driver");
	        String url="jdbc:mysql://localhost:3306/ctf";
	        String username="ctf";
	        String password="ctf123";
	        Connection con=DriverManager.getConnection(url,username,password);
	        Statement stmt=con.createStatement();
	        String sql="select * from score";
	        ResultSet rs=stmt.executeQuery(sql);
	        List<Score>list1=new ArrayList<Score>();
	        while(rs.next())
	        {
	        	Score score=new Score();
	        	score.setQuestionid(rs.getInt("questionid"));
	        	score.setMembername(rs.getString("membername"));
	        
	       	  list1.add(score);
	       	 
	        }
	        request.setAttribute("list1", list1);
	        rs.close();
	        stmt.close();
	        con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
		

	}

	}
