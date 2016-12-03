package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import po.Score;

import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport {
	private static final long serialVersionUID=1L;
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
	private String membername;
	public String execute()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
	        String url="jdbc:mysql://localhost:3306/ctf";
	        String username="ctf";
	        String password="ctf123";
	        Connection con=DriverManager.getConnection(url,username,password);
	        
	        String sql="select * from score where membername=?";
	        PreparedStatement ps=con.prepareStatement(sql);
	        
	        ps.setString(1, membername);
	        ResultSet rs=ps.executeQuery();
	        List<Score>managelist=new ArrayList<Score>();
	        List list2=new ArrayList();
	        while(rs.next())
	        {
	       	 
	       	  Score score=new Score();
	       	  score.setMembername(rs.getString("membername"));
	       	  score.setScore(Double.parseDouble(rs.getString("score")));
	       	  score.setQuestionid(rs.getInt("questionid"));
	      
	       	  
	       	 
	       	 
	       	  managelist.add(score);
	       	 
	        }
	        request.setAttribute("managelist", managelist);
	        rs.close();
	        
	        con.close();
		
		
		return SUCCESS;
		

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return SUCCESS;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}

	
	
}
