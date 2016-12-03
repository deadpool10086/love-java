package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.IndexImageTop;
import po.Lcomment;
import po.Learn;

import com.opensymphony.xwork2.ActionSupport;

import dao.IIndexImageTop;
import dao.ILcommentDao;
import dao.ILearnDao;
import dao.impl.IndexImageTopImpl;
import dao.impl.LcommentDaoImpl;
import dao.impl.LearnDaoImpl;

public class IndexImageFindAction extends ActionSupport {
	private int indeximagetopid;
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
	public String execute()throws Exception{
		
		IIndexImageTop i=new IndexImageTopImpl();
		List<IndexImageTop> idex=i.findby(indeximagetopid);
		  
		
		
		
		
		 request.setAttribute("idex",idex);
		
		 
		
		return SUCCESS;
	}

	public int getIndeximagetopid() {
		return indeximagetopid;
	}

	public void setIndeximagetopid(int indeximagetopid) {
		this.indeximagetopid = indeximagetopid;
	}


	
	
	

}
