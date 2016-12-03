package action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Lcomment;
import po.Learn;

import com.opensymphony.xwork2.ActionSupport;

import dao.IFcommentDao;
import dao.ILcommentDao;
import dao.ILearnDao;
import dao.impl.FcommentDaoImpl;
import dao.impl.LcommentDaoImpl;
import dao.impl.LearnDaoImpl;

public class AddFcommentAction extends ActionSupport {
	private String  fcomment;
	private int forumid;
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
	 private String membername=request.getSession().getAttribute("info").toString();
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	String lcdate=df.format(new Date());
	
	public String execute()throws Exception{
		
		
		IFcommentDao f=new FcommentDaoImpl();
		f.Add(membername, lcdate, fcomment, forumid);
        
		
		
		
		
		
		
		
		 
		
		return SUCCESS;
	}

	public String getFcomment() {
		return fcomment;
	}

	public void setFcomment(String fcomment) {
		this.fcomment = fcomment;
	}

	public int getForumid() {
		return forumid;
	}

	public void setForumid(int forumid) {
		this.forumid = forumid;
	}


	
	
	
}
