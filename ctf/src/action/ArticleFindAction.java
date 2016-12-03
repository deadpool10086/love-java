package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Article;
import po.IndexImageTop;
import po.Lcomment;
import po.Learn;
import po.Tool;

import com.opensymphony.xwork2.ActionSupport;

import dao.IArticleDao;
import dao.IIndexImageTop;
import dao.ILcommentDao;
import dao.ILearnDao;
import dao.IToolDao;
import dao.impl.ArticleDaoImpl;
import dao.impl.IndexImageTopImpl;
import dao.impl.LcommentDaoImpl;
import dao.impl.LearnDaoImpl;
import dao.impl.ToolDaoImpl;

public class ArticleFindAction extends ActionSupport {
	private int articleid;
	HttpServletResponse response=ServletActionContext.getResponse();
	
	  
	HttpServletRequest request = ServletActionContext.getRequest();
	
	public String execute()throws Exception{
		
		IArticleDao iArticleDao=new ArticleDaoImpl();
		
		List<Article> idex=iArticleDao.findby(articleid);
		  
		 request.setAttribute("idex",idex);
		return SUCCESS;
	}

	public int getArticleid() {
		return articleid;
	}

	public void setArticleid(int articleid) {
		this.articleid = articleid;
	}

	

	


	
	
	

}
