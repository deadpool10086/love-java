package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Score;

import com.opensymphony.xwork2.ActionSupport;

import dao.IScoreDao;
import dao.impl.ScoreDaoImpl;

public class SeventhAction extends ActionSupport {

	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response=ServletActionContext.getResponse();
	 // Object root = ServletActionContext.getRequest().getAttribute("key");
	private String key7;
	private String membername=request.getSession().getAttribute("info").toString();
	private int questionid=7;
	private Double score1=200.00;
	
	public String execute()
	{
		Score score=new Score();
		IScoreDao scoreDao=new ScoreDaoImpl();
		if(key7.equals("inputfile"))
		{
			score=scoreDao.Add(membername, questionid, score1);
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}

	public String getKey7() {
		return key7;
	}

	public void setKey7(String key7) {
		this.key7 = key7;
	}


	
	
	
}
