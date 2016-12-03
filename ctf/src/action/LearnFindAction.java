package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Lcomment;
import po.Learn;

import com.opensymphony.xwork2.ActionSupport;

import dao.ILcommentDao;
import dao.ILearnDao;
import dao.impl.LcommentDaoImpl;
import dao.impl.LearnDaoImpl;

public class LearnFindAction extends ActionSupport {
	private int learnid;
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
	public String execute()throws Exception{
		
		ILearnDao learnDao= new LearnDaoImpl();
		ILcommentDao iLcommentDao=new LcommentDaoImpl();
		List<Learn> LList=learnDao.Find(learnid);
        
		
		
		List<Lcomment> LList1=iLcommentDao.Find(learnid);
		
		 request.setAttribute("LList",LList);
		
		 request.setAttribute("LFList1",LList1);
		
		return SUCCESS;
	}

	public int getLearnid() {
		return learnid;
	}

	public void setLearnid(int learnid) {
		this.learnid = learnid;
	}
	
	
	

}
