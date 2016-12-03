package action;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Article;
import po.IndexImageTop;
import po.KuaiXun;
import po.Tool;



import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.IArticleDao;
import dao.IIndexImageTop;
import dao.IKuaiXunDao;
import dao.IToolDao;
import dao.IUserDao;
import dao.impl.ArticleDaoImpl;
import dao.impl.IndexImageTopImpl;
import dao.impl.KuaiXunDaoImpl;
import dao.impl.ToolDaoImpl;
import dao.impl.UserDaoImpl;
public class KuaiXunAction extends ActionSupport {
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	public String execute()throws Exception{
		
		IKuaiXunDao kuaiXunDao= new KuaiXunDaoImpl();
		List<KuaiXun> kxList= kuaiXunDao.Find();
		IIndexImageTop iIndexImageTop=new IndexImageTopImpl();
		List<IndexImageTop> i =iIndexImageTop.findall();
		IToolDao t=new ToolDaoImpl();
		List<Tool> tList=t.findall();
		IArticleDao a=new ArticleDaoImpl();
		List<Article> aList=a.findall();
		 request.setAttribute("kxlist",kxList);
		 request.setAttribute("topimage",i);
		 request.setAttribute("tlist",tList);
		 request.setAttribute("alist",aList);
		return SUCCESS;
	}
	
	
	
	

}
