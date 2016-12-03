package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Score;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.txw2.Document;

import dao.IScoreDao;

import dao.impl.ScoreDaoImpl;


public class FirstAction extends ActionSupport {
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response=ServletActionContext.getResponse();
	 // Object root = ServletActionContext.getRequest().getAttribute("key");
	private String key1;
	private String membername=request.getSession().getAttribute("info").toString();
	private int questionid=1;
	private Double score1=100.00;
	public String execute()
	{
		Score score=new Score();
		IScoreDao scoreDao=new ScoreDaoImpl();
		if(key1.equals("justforfun"))
		{   
			
		    	
			// pageContext.getOut().print("<span class='label label-warning'></span>");
			score=scoreDao.Add(membername, questionid, score1);
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}

	public String getKey1() {
		return key1;
	}

	public void setKey1(String key1) {
		this.key1 = key1;
	}
	
	
	
}
