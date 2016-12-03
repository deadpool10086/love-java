package action;



import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import po.Member;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.IMemberDao;
import dao.impl.MemberDaoImpl;

public class MemberLoginAction extends ActionSupport {

	private static final long serialVersionUID=1L;
	private String membername;
	private String memberpassword;
	private Map<String, Object>session;

	public MemberLoginAction(){
		
		ActionContext context=ActionContext.getContext();
		
		session=context.getSession();
	}
	
	@Override
	public String execute()throws Exception{
		
		IMemberDao memberDao=new MemberDaoImpl();
		Member member=new Member();
		member=memberDao.UserLoginCheck(membername, memberpassword);
		if(member!=null){
			
		session.put("info", membername);
		
		
	      return SUCCESS;
		}
		else {
			return ERROR;
		}
	}

	public String getMembername() {
		
		return membername;
	}
		

	public void setMembername(String membername){
		this.membername=membername;
		//membername..setCharacterEncoding("GBK"); 
	}

	public String getMemberpassword(){
		return memberpassword;
		
	}

	public void setMemberpassword(String memberpassword)  {
		this.memberpassword =memberpassword;
	}

	
	
	
	
	
}
