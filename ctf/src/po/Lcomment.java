package po;

public class Lcomment {
	public int lcommentid;
	public String membername;
	public String lcdate;
	public String lcomment;
	public int learnid;
	
	public Lcomment()
	{}

	public Lcomment(int lcommentid, String membername, String lcdate,
			String lcomment, int learnid) {
		super();
		this.lcommentid = lcommentid;
		this.membername = membername;
		this.lcdate = lcdate;
		this.lcomment = lcomment;
		this.learnid = learnid;
	}

	public int getLcommentid() {
		return lcommentid;
	}

	public void setLcommentid(int lcommentid) {
		this.lcommentid = lcommentid;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getLcdate() {
		return lcdate;
	}

	public void setLcdate(String lcdate) {
		this.lcdate = lcdate;
	}

	public String getLcomment() {
		return lcomment;
	}

	public void setLcomment(String lcomment) {
		this.lcomment = lcomment;
	}

	public int getLearnid() {
		return learnid;
	}

	public void setLearnid(int learnid) {
		this.learnid = learnid;
	}
	
	

}
