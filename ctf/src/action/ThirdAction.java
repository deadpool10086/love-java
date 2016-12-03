package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Score;

import com.opensymphony.xwork2.ActionSupport;

import dao.IScoreDao;
import dao.impl.ScoreDaoImpl;

public class ThirdAction extends ActionSupport {

	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response=ServletActionContext.getResponse();
	 // Object root = ServletActionContext.getRequest().getAttribute("key");
	private String key3;
	private String membername=request.getSession().getAttribute("info").toString();
	private int questionid=3;
	private Double score1=200.00;
	
	public String execute()
	{
		Score score=new Score();
		IScoreDao scoreDao=new ScoreDaoImpl();
		if(key3.equals("fuzzzzz1"))
		{
			score=scoreDao.Add(membername, questionid, score1);
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}

	public String getKey3() {
		return key3;
	}

	public void setKey3(String key3) {
		this.key3 = key3;
	}
	
	
	
}
