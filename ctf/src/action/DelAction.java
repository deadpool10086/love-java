package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class DelAction extends ActionSupport {
	private int  questionid;
	private String membername;
	public String execute()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
	        String url="jdbc:mysql://localhost:3306/ctf";
	        String username="ctf";
	        String password="ctf123";
	        Connection con=DriverManager.getConnection(url,username,password);
	        
	        String sql="delete from score where questionid=? and membername=?";
	        PreparedStatement ps=con.prepareStatement(sql);
	        ps.setInt(1, questionid);
	        ps.setString(2, membername);
	        ps.executeUpdate();
	        ps.close();
	        con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return SUCCESS;
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	

	
	
	
	

}
