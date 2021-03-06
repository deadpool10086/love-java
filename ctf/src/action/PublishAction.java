package action;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.taglibs.standard.lang.jstl.test.PageContextImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.ILearnDao;
import dao.impl.LearnDaoImpl;

public class PublishAction extends ActionSupport {
	private String category;
	private String title;
	private String content;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String execute() throws Exception {
		// System.out.println("category:"+category);
		// System.out.println("title"+title);
		// System.out.println("content"+content);
		// String Date=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		// String realPath =
		// ServletActionContext.getRequest().getRealPath("/upload")+"/"+Date;
		// System.out.println("路径"+realPath);
        ILearnDao learnDao=new LearnDaoImpl();
       // String s2 = new String(title.getBytes("gb2312"),"ISO-8859-1");
        learnDao.Add(title, category, content, "2016-04-05");
        System.out.println(title);
		ActionContext cxt = ActionContext.getContext();
		Map request = (Map) cxt.get("request");

		request.put("category", category);
		request.put("title", title);
		request.put("content", content);
		return SUCCESS;

	}

}