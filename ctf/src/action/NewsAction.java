package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.News;
import po.Question;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class NewsAction extends ActionSupport {
	
private static final long serialVersionUID=1L;
	
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
	//private String membername=request.getSession().toString();
	
	public String execute()throws Exception{
		ActionContext context=ActionContext.getContext();
		if(context.getSession().isEmpty())
		{
			return ERROR;
		}
			else
			{
				
		try {
			 Class.forName("com.mysql.jdbc.Driver");
	        String url="jdbc:mysql://localhost:3306/ctf";
	        String username="ctf";
	        String password="ctf123";
	        Connection con=DriverManager.getConnection(url,username,password);
	        Statement stmt=con.createStatement();
	      
	        String sql="select * from news";
	        
	        
	        ResultSet rs=stmt.executeQuery(sql);
	     
	        
	        List<News>newslist=new ArrayList<News>();
	        
	      
	      
	        while(rs.next())
	        {
	       	  
	       
	       	  News news=new News();
	       	  news.setNewstime(rs.getString("newstime"));
	       	  news.setNewscontent(rs.getString("newscontent"));
	       	 
	       	  
	       	  newslist.add(news);
	       	 
	        }
	        
	  
	        
	       
	        request.setAttribute("newslist", newslist);
	       
	      
	       
	        rs.close();
	        stmt.close();
	        con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
		

	}
	
	
	
	}
}

	
