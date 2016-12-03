package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.IArticleDao;
import dao.IIndexImageTop;
import dao.impl.ArticleDaoImpl;
import dao.impl.IndexImageTopImpl;

public class AddArticleAction extends ActionSupport {
	public String articleimageurl;
	public String articletitle;
	public String articlepre;
	public String articledate;
	public String articlecontent;

	private List<File> file;

	private List<String> fileFileName;

	private List<String> fileContentType;

	private List<String> dataUrl;

	@Override
	public String execute() throws Exception {
		dataUrl = new ArrayList<String>();
		// �ļ����·��
		String imgpath = "/upload/";
		for (int i = 0; i < file.size(); ++i) {
			InputStream is = new FileInputStream(file.get(i));

			String path = ServletActionContext.getServletContext().getRealPath(
					"/");
			System.out.println(path);
			// String root = "D:\\";
			String name = this.getFileFileName().get(i);
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
			String g = df.format(new Date());
			String nn = name.substring(name.length() - 4, name.length());
			String fname = g + nn;

			dataUrl.add(imgpath + fname);
			System.out.println(dataUrl.get(i));
			File destFile = new File(path + imgpath, fname);

			OutputStream os = new FileOutputStream(destFile);

			byte[] buffer = new byte[400];

			int length = 0;

			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}

			is.close();

			os.close();
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String articledate1 = sdf.format(new Date());
		System.out.println(dataUrl.get(0));
		String fullpath = dataUrl.get(0);
		IArticleDao articleDao = new ArticleDaoImpl();
		articleDao.add(fullpath, articletitle, articlepre, articledate1,
				articlecontent);
		return SUCCESS;
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

	public List<File> getFile() {
		return file;
	}

	public void setFile(List<File> file) {
		this.file = file;
	}

	public List<String> getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(List<String> fileFileName) {
		this.fileFileName = fileFileName;
	}

	public List<String> getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}

	public List<String> getDataUrl() {
		return dataUrl;
	}

	public void setDataUrl(List<String> dataUrl) {
		this.dataUrl = dataUrl;
	}

}