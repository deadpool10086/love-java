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

import dao.ILcommentDao;
import dao.ILearnDao;
import dao.impl.LcommentDaoImpl;
import dao.impl.LearnDaoImpl;

public class AddLcommentAction extends ActionSupport {
	private String  lcomment;
	private int learnid;
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
	 private String membername=request.getSession().getAttribute("info").toString();
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	String lcdate=df.format(new Date());
	
	public String execute()throws Exception{
		
		
		ILcommentDao iLcommentDao=new LcommentDaoImpl();
		
        
		
		
		iLcommentDao.Add(membername, lcdate, lcomment, learnid);
		
		
		
		
		 
		
		return SUCCESS;
	}

	public String getLcomment() {
		return lcomment;
	}

	public void setLcomment(String lcomment) {
		this.lcomment = lcomment;
	}

	public int getLearnid() {
		return learnid;
	}

	public void setLearnid(int learnid) {
		this.learnid = learnid;
	}



	
	
	
}
