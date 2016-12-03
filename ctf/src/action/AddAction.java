package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;






import po.Vote;



import com.opensymphony.xwork2.ActionSupport;

import dao.IVoteDao;
import dao.impl.VoteDaoImpl;

public class AddAction extends ActionSupport {
	private static final long serialVersionUID=1L;
  
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response=ServletActionContext.getResponse();
	
	private String voteforname;
	private String membername=request.getSession().getAttribute("info").toString();
	private String ip=request.getRemoteAddr().toString();
	private String time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()).toString(); ;
	
	
	//String voteforname=request.getParameter("vote_10174");
	
//	   public AddAction(){
//		   
//			ActionContext context=ActionContext.getContext();
////			request1=(Map<String, Object>)context.get("request");
////			request1.put("info1",request.getRemoteAddr().toString() );
//	   }
	   
	@Override
	public String execute()throws Exception{
		
		IVoteDao voteDao=new VoteDaoImpl();
		Vote vote =new Vote();
		
		
       	 Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/vote";
            String username="stoical";
            String password="123456";
            Connection con=DriverManager.getConnection(url,username,password);
           // Statement stmt=con.createStatement();
            String sql="select membername from vote where membername=?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, membername);
            
            ResultSet rs=ps.executeQuery();
           
            
            
            if(rs.next())
            {
           	 response.setContentType("text/html;charset=gb2312"); 
        		response.getWriter().printf("<script>alert('you hava voted please do not vote again!');location.href='login2.jsp'</script>");
           	 System.out.print("heh");
           	 return ERROR;
           	 
            }
            else {
            vote=voteDao.Update(voteforname, membername, ip, time);
           	 response.setContentType("text/html;charset=gb2312"); 
        		response.getWriter().printf("<script>alert('successful!');location.href='login2.jsp'</script>");
           	
        	return SUCCESS;
			}
			
		
		
      
		
		
		
		
		
	}

	
	
	
	
	public String getVoteforname() {
		return voteforname;
	}
	public void setVoteforname(String voteforname) {
		this.voteforname =voteforname;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip =ip; 
	}
	public String getTime() {
		return time;
	}
	public void setTime() {
		this.time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()).toString(); 
	}
	
	
	
}
