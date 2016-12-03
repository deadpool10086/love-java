package po;

public class Forum {
	public int forumid;
	public String ftitle;
	public String membername;
	public String fdate;
	public String fcontent;
	
	public Forum()
	{}

	public Forum(int forumid, String ftitle, String membername, String fdate,
			String fcontent) {
		super();
		this.forumid = forumid;
		this.ftitle = ftitle;
		this.membername = membername;
		this.fdate = fdate;
		this.fcontent = fcontent;
	}

	public int getForumid() {
		return forumid;
	}

	public void setForumid(int forumid) {
		this.forumid = forumid;
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
