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
import org.apache.struts2.components.Else;
import org.apache.struts2.components.If;

import po.Question;
import po.Vote;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ListQuestionAction extends ActionSupport {

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
	        Statement stmt3=con.createStatement();
	        Statement stmt4=con.createStatement();
	        String sql="select * from question where questiontype='web'";
	        String sql3="select * from question where questiontype='reverse'";
	        String sql4="select * from question where questiontype='mobile'";
	        
	        
	        ResultSet rs=stmt.executeQuery(sql);
	        ResultSet rs3=stmt3.executeQuery(sql3);
	        ResultSet rs4=stmt4.executeQuery(sql4);
	      
	        List<Question>list=new ArrayList<Question>();
	        List<Question>list3=new ArrayList<Question>();
	        List<Question>list4=new ArrayList<Question>();
	      
	        while(rs.next())
	        {
	       	  
	       	  Question question=new Question();
	       	  question.setQuestionid(rs.getInt("questionid"));
	       	  question.setQuestionname(rs.getString("questionname"));
	       	  question.setQuestionscore(rs.getInt("questionscore"));
	       	  question.setQuestionhref(rs.getString("questionhref"));
	       	  question.setQuestiontype(rs.getString("questiontype"));
	       
	       	  
	       	  list.add(question);
	       	 
	        }
	        
	        while(rs3.next())
	        {
	       	  
	       	  Question question=new Question();
	       	  question.setQuestionid(rs3.getInt("questionid"));
	       	  question.setQuestionname(rs3.getString("questionname"));
	       	  question.setQuestionscore(rs3.getInt("questionscore"));
	       	  question.setQuestionhref(rs3.getString("questionhref"));
	       	  question.setQuestiontype(rs3.getString("questiontype"));
	       
	       	  
	       	  list3.add(question);
	       	 
	        }
	        
	        while(rs4.next())
	        {
	       	  
	       	  Question question=new Question();
	       	  question.setQuestionid(rs4.getInt("questionid"));
	       	  question.setQuestionname(rs4.getString("questionname"));
	       	  question.setQuestionscore(rs4.getInt("questionscore"));
	       	  question.setQuestionhref(rs4.getString("questionhref"));
	       	  question.setQuestiontype(rs4.getString("questiontype"));
	       
	       	  
	       	  list4.add(question);
	       	 
	        }
	        
	       
	        request.setAttribute("list", list);
	        request.setAttribute("list1", list);
	        request.setAttribute("list3", list3);
	        request.setAttribute("list4", list4);
	       
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

	
