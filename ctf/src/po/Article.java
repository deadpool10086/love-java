package po;

public class Article {
	public int articleid;
	public String articleimageurl;
	public String articletitle;
	public String articlepre;
	public String articledate;
	public String articlecontent;
	public Article() {
		super();
	}
	public Article(int articleid, String articleimageurl, String articletitle,
			String articlepre, String articledate, String articlecontent) {
		super();
		this.articleid = articleid;
		this.articleimageurl = articleimageurl;
		this.articletitle = articletitle;
		this.articlepre = articlepre;
		this.articledate = articledate;
		this.articlecontent = articlecontent;
	}
	public int getArticleid() {
		return articleid;
	}
	public void setArticleid(int articleid) {
		this.articleid = articleid;
	}
	public String getArticleimageurl() {
		return articleimageurl;
	}
	public void setArticleimageurl(String articleimageurl) {
		this.articleimageurl = articleimageurl;
	}
	public String getArticletitle() {
		return articletitle;
	}
	public void setArticletitle(String articletitle) {
		this.articletitle = articletitle;
	}
	public String getArticlepre() {
		return articlepre;
	}
	public void setArticlepre(String articlepre) {
		this.articlepre = articlepre;
	}
	public String getArticledate() {
		return articledate;
	}
	public void setArticledate(String articledate) {
		this.articledate = articledate;
	}
	public String getArticlecontent() {
		return articlecontent;
	}
	public void setArticlecontent(String articlecontent) {
		this.articlecontent = articlecontent;
	}
	
	

}
