package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.omg.CORBA.Request;

import com.opensymphony.xwork2.ActionSupport;

import dao.IArticleDao;
import dao.IForumDao;
import dao.IIndexImageTop;
import dao.impl.ArticleDaoImpl;
import dao.impl.ForumDaoImpl;
import dao.impl.IndexImageTopImpl;

public class AddForumAction extends ActionSupport {
	public String ftitle;
	public String membername;
	public String fdate;
	public String fcontent;

	
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
	public String execute() throws Exception {
	
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = sdf.format(new Date());
		String string=request.getSession().getAttribute("info").toString();
		
		IForumDao f=new ForumDaoImpl();
		f.Add(ftitle, string, date1, fcontent);
		return SUCCESS;
	}




	public String getFtitle() {
		return ftitle;
	}




	public void setFtitle(String ftitle) {
		this.ftitle = ftitle;
	}




	public String getMembername() {
		return membername;
	}




	public void setMembername(String membername) {
		this.membername = membername;
	}




	public String getFdate() {
		return fdate;
	}




	public void setFdate(String fdate) {
		this.fdate = fdate;
	}




	public String getFcontent() {
		return fcontent;
	}




	public void setFcontent(String fcontent) {
		this.fcontent = fcontent;
	}



}