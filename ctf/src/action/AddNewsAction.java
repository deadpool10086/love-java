package action;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.opensymphony.xwork2.ActionSupport;

import dao.INewsDao;
import dao.impl.NewsDaoImpl;

public class AddNewsAction extends ActionSupport {
	private String newscontent;
	private String newstime=new SimpleDateFormat("MM-dd HH:mm").format(Calendar.getInstance().getTime()).toString();
	
	public String execute()
	{
		INewsDao newsDao=new NewsDaoImpl();
		newsDao.Add(newstime, newscontent);
		
		return SUCCESS;
	}

	public String getNewscontent() {
		return newscontent;
	}

	public void setNewscontent(String newscontent) {
		this.newscontent = newscontent;
	}
	
	
	

}
