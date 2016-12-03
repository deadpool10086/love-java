package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import po.Member;
import po.Rank;
import po.Score;
import po.Vote;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AdminRankAction extends ActionSupport {

	private static final long serialVersionUID=1L;
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
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
	        String sql="select tb.membername,tb.rank,tb.score,ta.t_a,ta.t_b,ta.t_c,ta.t_d,ta.t_e,ta.t_f,ta.t_g,ta.t_h,ta.t_i from(select membername,sum(case when questionid='1' then 1 else 0 end) as t_a,sum(case when questionid='2' then 1 else 0 end) as t_b,sum(case when questionid='3' then 1 else 0 end) as t_c,sum(case when questionid='4' then 1 else 0 end) as t_d,sum(case when questionid='5' then 1 else 0 end) as t_e,sum(case when questionid='6' then 1 else 0 end) as t_f,sum(case when questionid='7' then 1 else 0 end) as t_g,sum(case when questionid='8' then 1 else 0 end) as t_h,sum(case when questionid='9' then 1 else 0 end) as t_i from score group by membername)ta,(select membername, score,if(@score > score, @rank:=@rank+@num+1, @rank) rank, if(@score = score, @num:=@num+1, @num:=0),@score:=score  from(select @score:=0, @rank:=1, @num:=0, membername,sum(score) score from  score group by membername order by score desc) tmp)tb where tb.membername=ta.membername";
	        ResultSet rs=stmt.executeQuery(sql);
	       // List<Member>adminlist=new ArrayList<Member>();
	        List<Rank>ranklist=new ArrayList<Rank>();
	       // ArrayList<String>  list3 = new ArrayList();
	       // ArrayList<String>  list4 = new ArrayList();
	       // List list2=new ArrayList();
	        while(rs.next())
	        {
	       	// Member member=new Member();
	       	 Rank rank=new Rank();
	       	 // Score score=new Score();
	       	 // score.setMembername(rs.getString("membername"));
	       	 rank.setRank(rs.getString("rank"));
	       	 rank.setMembername(rs.getString("membername"));
	       	 rank.setScore(rs.getString("score"));
	       	 rank.setQ1(rs.getString("t_a"));
	       	rank.setQ2(rs.getString("t_b"));
	       	rank.setQ3(rs.getString("t_c"));
	       	rank.setQ4(rs.getString("t_d"));
	       	rank.setQ5(rs.getString("t_e"));
	       	rank.setQ6(rs.getString("t_f"));
	       	rank.setQ7(rs.getString("t_g"));
	       	rank.setQ8(rs.getString("t_h"));
	       	rank.setQ9(rs.getString("t_i"));
	      
	         	//ArrayList<String>  list4 = new ArrayList();
	         	//list4=(ArrayList<String>) rs.getArray("a");
	       	 
	       	 // score.setScore(Double.parseDouble(rs.getString("questionid")));
	       	// list3.add(a);
	       	
	       	 //list4.add(d);
	       	 
	       	 ranklist.add(rank);
	       	 
	        }
	        request.setAttribute("ranklist", ranklist);
	        //request.setAttribute("list3", list3);
	       // request.setAttribute("list4", list4);
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
