package po;

public class Css {
	private int cssid;
	private String cssname;
	
	public Css()
	{}

	public Css(int cssid, String cssname) {
		super();
		this.cssid = cssid;
		this.cssname = cssname;
	}

	public int getCssid() {
		return cssid;
	}

	public void setCssid(int cssid) {
		this.cssid = cssid;
	}

	public String getCssname() {
		return cssname;
	}

	public void setCssname(String cssname) {
		this.cssname = cssname;
	}
	
	

}
