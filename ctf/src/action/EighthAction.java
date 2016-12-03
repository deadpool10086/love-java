package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Score;

import com.opensymphony.xwork2.ActionSupport;

import dao.IScoreDao;
import dao.impl.ScoreDaoImpl;

public class EighthAction extends ActionSupport {

	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response=ServletActionContext.getResponse();
	 // Object root = ServletActionContext.getRequest().getAttribute("key");
	private String key8;
	private String membername=request.getSession().getAttribute("info").toString();
	private int questionid=8;
	private Double score1=200.00;
	
	public String execute()
	{
		Score score=new Score();
		IScoreDao scoreDao=new ScoreDaoImpl();
		if(key8.equals("10"))
		{
			score=scoreDao.Add(membername, questionid, score1);
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}

	public String getKey8() {
		return key8;
	}

	public void setKey8(String key8) {
		this.key8 = key8;
	}

	

	
	
	
}
