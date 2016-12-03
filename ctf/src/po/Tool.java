package po;

public class Tool {
	public int toolid;
	public String toolimageurl;
	public String tooltitle;
	public String tooldate;
	public String toolcontent;
	
	public Tool()
	{}

	public Tool(int toolid, String toolimageurl, String tooltitle,
			String tooldate, String toolcontent) {
		super();
		this.toolid = toolid;
		this.toolimageurl = toolimageurl;
		this.tooltitle = tooltitle;
		this.tooldate = tooldate;
		this.toolcontent = toolcontent;
	}

	public int getToolid() {
		return toolid;
	}

	public void setToolid(int toolid) {
		this.toolid = toolid;
	}

	public String getToolimageurl() {
		return toolimageurl;
	}

	public void setToolimageurl(String toolimageurl) {
		this.toolimageurl = toolimageurl;
	}

	public String getTooltitle() {
		return tooltitle;
	}

	public void setTooltitle(String tooltitle) {
		this.tooltitle = tooltitle;
	}

	public String getTooldate() {
		return tooldate;
	}

	public void setTooldate(String tooldate) {
		this.tooldate = tooldate;
	}

	public String getToolcontent() {
		return toolcontent;
	}

	public void setToolcontent(String toolcontent) {
		this.toolcontent = toolcontent;
	}
	
	

}
