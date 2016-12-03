package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Forum;
import po.KuaiXun;
import po.Learn;

import com.opensymphony.xwork2.ActionSupport;

import dao.IForumDao;
import dao.IKuaiXunDao;
import dao.ILearnDao;
import dao.impl.ForumDaoImpl;
import dao.impl.KuaiXunDaoImpl;
import dao.impl.LearnDaoImpl;

public class ForumAction extends ActionSupport {
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	private int newPage;
	public String execute()throws Exception{
		
		IForumDao forumDao=new ForumDaoImpl();
		List<Forum> LList=forumDao.findIimitPage(newPage);
		int countPage = forumDao.getCountRecord();
		 request.setAttribute("LList",LList);
		 request.setAttribute("countPage",countPage);
		return SUCCESS;
	}
	public int getNewPage() {
		return newPage;
	}
	public void setNewPage(int newPage) {
		this.newPage = newPage;
	}
	
	

}
