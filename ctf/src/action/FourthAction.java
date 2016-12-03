package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Score;

import com.opensymphony.xwork2.ActionSupport;

import dao.IScoreDao;
import dao.impl.ScoreDaoImpl;

public class FourthAction extends ActionSupport {

	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response=ServletActionContext.getResponse();
	 // Object root = ServletActionContext.getRequest().getAttribute("key");
	private String key4;
	private String membername=request.getSession().getAttribute("info").toString();
	private int questionid=4;
	private Double score1=200.00;
	
	public String execute()
	{
		Score score=new Score();
		IScoreDao scoreDao=new ScoreDaoImpl();
		if(key4.equals("SEcL0ver@2014"))
		{
			score=scoreDao.Add(membername, questionid, score1);
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}

	public String getKey4() {
		return key4;
	}

	public void setKey4(String key4) {
		this.key4 = key4;
	}
	
	
	
}
