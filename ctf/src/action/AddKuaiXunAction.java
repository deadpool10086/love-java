package action;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.opensymphony.xwork2.ActionSupport;

import dao.IKuaiXunDao;
import dao.INewsDao;
import dao.impl.KuaiXunDaoImpl;
import dao.impl.NewsDaoImpl;

public class AddKuaiXunAction extends ActionSupport {
	public String kxtitle;
	public String kxurl;
	public String execute()
	{
		IKuaiXunDao kuaiXunDao=new KuaiXunDaoImpl();
		kuaiXunDao.addKuaiXun(kxtitle, kxurl);
		
		return SUCCESS;
	}
	public String getKxtitle() {
		return kxtitle;
	}
	public void setKxtitle(String kxtitle) {
		this.kxtitle = kxtitle;
	}
	public String getKxurl() {
		return kxurl;
	}
	public void setKxurl(String kxurl) {
		this.kxurl = kxurl;
	}



}
