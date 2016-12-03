package action;

import java.util.Map;

import po.Admin;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.IUserDao;
import dao.impl.UserDaoImpl;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String adminname;
	private String adminpassword;
	private Map<String, Object> session;

	public LoginAction() {

         ActionContext context=ActionContext.getContext();
		
		session=context.getSession();
	}
	
	public String execute()throws Exception{
		
		IUserDao userDao= new UserDaoImpl();
		Admin admin=new Admin();
		admin=userDao.UserLoginCheck(adminname, adminpassword);
		if(admin!=null)
		{
			session.put("info1", adminname);
			
			
		      return SUCCESS;
			}
			else {
				return ERROR;
			}
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdminpassword() {
		return adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	
	
}
