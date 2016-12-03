package po;

import javax.xml.crypto.Data;

public class News {
	
	private int newsid;
	private String newstime;
	private String newscontent;
	
	public News()
	{}

	public News(int newsid, String newstime, String newscontent) {
		super();
		this.newsid = newsid;
		this.newstime = newstime;
		this.newscontent = newscontent;
	}

	public int getNewsid() {
		return newsid;
	}

	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}

	public String getNewstime() {
		return newstime;
	}

	public void setNewstime(String newstime) {
		this.newstime = newstime;
	}

	public String getNewscontent() {
		return newscontent;
	}

	public void setNewscontent(String newscontent) {
		this.newscontent = newscontent;
	}
	
	

}
