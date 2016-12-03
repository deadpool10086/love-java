package po;

public class Fcomment {
	public int fcommentid;
	public String membername;
	public String fcdate;
	public String fcomment;
	public int forumid;
	public Fcomment() {
		super();
	}
	public Fcomment(int fcommentid, String membername, String fcdate,
			String fcomment, int forumid) {
		super();
		this.fcommentid = fcommentid;
		this.membername = membername;
		this.fcdate = fcdate;
		this.fcomment = fcomment;
		this.forumid = forumid;
	}
	public int getFcommentid() {
		return fcommentid;
	}
	public void setFcommentid(int fcommentid) {
		this.fcommentid = fcommentid;
	}
	public String getMembername() {
		return membername;
	}
	public void setMembername(String membername) {
		this.membername = membername;
	}
	public String getFcdate() {
		return fcdate;
	}
	public void setFcdate(String fcdate) {
		this.fcdate = fcdate;
	}
	public String getFcomment() {
		return fcomment;
	}
	public void setFcomment(String fcomment) {
		this.fcomment = fcomment;
	}
	public int getForumid() {
		return forumid;
	}
	public void setForumid(int forumid) {
		this.forumid = forumid;
	}
	
	
	

}
