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
import dao.ITrainDao;
import dao.impl.ArticleDaoImpl;
import dao.impl.ForumDaoImpl;
import dao.impl.IndexImageTopImpl;
import dao.impl.TrainDaoImpl;

public class AddTrainAction extends ActionSupport {
	public String traintitle;
	public String traintype;
	public String traindate;
	public String traincontent;

	
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
	public String execute() throws Exception {
	
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date1 = sdf.format(new Date());
		
		
		ITrainDao trainDao=new TrainDaoImpl();
		trainDao.Add(traintitle, traintype, date1,traincontent);
		return SUCCESS;
	}

	public String getTraintitle() {
		return traintitle;
	}

	public void setTraintitle(String traintitle) {
		this.traintitle = traintitle;
	}

	public String getTraintype() {
		return traintype;
	}

	public void setTraintype(String traintype) {
		this.traintype = traintype;
	}

	public String getTraindate() {
		return traindate;
	}

	public void setTraindate(String traindate) {
		this.traindate = traindate;
	}

	public String getTraincontent() {
		return traincontent;
	}

	public void setTraincontent(String traincontent) {
		this.traincontent = traincontent;
	}




	

}