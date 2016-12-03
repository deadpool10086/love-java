package po;

public class Learn {
	public int learnid;
	public String learntitle;
	public String learncontentpre;
	public String learncontent;
	public String learndate;
	public Learn()
	{}
	public Learn(int learnid, String learntitle, String learncontentpre,
			String learncontent, String learndate) {
		super();
		this.learnid = learnid;
		this.learntitle = learntitle;
		this.learncontentpre = learncontentpre;
		this.learncontent = learncontent;
		this.learndate = learndate;
	}
	public int getLearnid() {
		return learnid;
	}
	public void setLearnid(int learnid) {
		this.learnid = learnid;
	}
	public String getLearntitle() {
		return learntitle;
	}
	public void setLearntitle(String learntitle) {
		this.learntitle = learntitle;
	}
	public String getLearncontentpre() {
		return learncontentpre;
	}
	public void setLearncontentpre(String learncontentpre) {
		this.learncontentpre = learncontentpre;
	}
	public String getLearncontent() {
		return learncontent;
	}
	public void setLearncontent(String learncontent) {
		this.learncontent = learncontent;
	}
	public String getLearndate() {
		return learndate;
	}
	public void setLearndate(String learndate) {
		this.learndate = learndate;
	}
	
	
}
