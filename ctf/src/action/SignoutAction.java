package action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SignoutAction extends ActionSupport {
	
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response=ServletActionContext.getResponse();
	//private String membername=request.getSession().getAttribute("info").toString();
	private Map<String, Object> session;
	public String execute()
	{
		//Map<String, String> attibutes = ActionContext.getContext().getSession(); 
		ActionContext context=ActionContext.getContext();
		context.getSession().clear();
		//session.remove(membername);
		
		return SUCCESS;
	}
}
