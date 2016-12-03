package po;

public class KuaiXun {
	public int kxid;
	public String kxtitle;
	public String kxurl;
	
	public KuaiXun()
	{}

	public KuaiXun(int kxid, String kxtitle, String kxurl) {
		super();
		this.kxid = kxid;
		this.kxtitle = kxtitle;
		this.kxurl = kxurl;
	}

	public int getKxid() {
		return kxid;
	}

	public void setKxid(int kxid) {
		this.kxid = kxid;
	}

	public String getKxtitle() {
		return kxtitle;
	}

	public void setKxtitle(String kxtitle) {
		this.kxtitle = kxtitle;
	}

	public String getKxurl() {
		return kxurl;
	}

	public void setKxurl(String kxurl) {
		this.kxurl = kxurl;
	}
	
	

}
