package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.IndexImageTop;
import po.Lcomment;
import po.Learn;
import po.Tool;

import com.opensymphony.xwork2.ActionSupport;

import dao.IIndexImageTop;
import dao.ILcommentDao;
import dao.ILearnDao;
import dao.IToolDao;
import dao.impl.IndexImageTopImpl;
import dao.impl.LcommentDaoImpl;
import dao.impl.LearnDaoImpl;
import dao.impl.ToolDaoImpl;

public class ToolFindAction extends ActionSupport {
	private int toolid;
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
	public String execute()throws Exception{
		
		
		IToolDao toolDao=new ToolDaoImpl();
		
		List<Tool> idex=toolDao.findby(toolid);
		  
		
		
		
		
		 request.setAttribute("idex",idex);
		
		 
		
		return SUCCESS;
	}

	public int getToolid() {
		return toolid;
	}

	public void setToolid(int toolid) {
		this.toolid = toolid;
	}

	


	
	
	

}
