package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Fcomment;
import po.Forum;
import po.Lcomment;
import po.Learn;

import com.opensymphony.xwork2.ActionSupport;

import dao.IFcommentDao;
import dao.IForumDao;
import dao.ILcommentDao;
import dao.ILearnDao;
import dao.impl.FcommentDaoImpl;
import dao.impl.ForumDaoImpl;
import dao.impl.LcommentDaoImpl;
import dao.impl.LearnDaoImpl;

public class ForumFindAction extends ActionSupport {
	private int forumid;
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
	public String execute()throws Exception{
		
		
		IForumDao forumDao=new ForumDaoImpl();
	    
        
		
		
		IFcommentDao f=new FcommentDaoImpl();
		List<Fcomment>fcList=f.Find(forumid);
		List<Forum> fList=forumDao.Find(forumid);
		
		
		
		 request.setAttribute("flist",fList);
		 request.setAttribute("fclist",fcList);
		
		return SUCCESS;
	}

	public int getForumid() {
		return forumid;
	}

	public void setForumid(int forumid) {
		this.forumid = forumid;
	}

	
	
	
	

}
