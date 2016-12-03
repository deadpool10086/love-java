package action;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import dao.IIndexImageTop;
import dao.IToolDao;
import dao.impl.IndexImageTopImpl;
import dao.impl.ToolDaoImpl;


public class AddToolAction extends ActionSupport {
	public String toolimageurl;
	public String tooltitle;
	public String tooldate;
	public String toolcontent;
	

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

            String path = ServletActionContext.getServletContext().getRealPath("/");
            System.out.println(path);
        //    String root = "D:\\";
            String name=this.getFileFileName().get(i);
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
            String g=df.format(new Date());
            String nn=name.substring(name.length()-4,name.length());
            String fname=g+nn;
            
            dataUrl.add(imgpath+fname);
            System.out.println(dataUrl.get(i));
            File destFile = new File(path+imgpath,fname);

            OutputStream os = new FileOutputStream(destFile);

            byte[] buffer = new byte[400];

            int length = 0;

            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }

            is.close();

            os.close();
        }
       
        
        System.out.println(dataUrl.get(0));
        String fullpath=dataUrl.get(0);
        IToolDao toolDao=new ToolDaoImpl();
        toolDao.add(fullpath,tooltitle,"",toolcontent);
        return SUCCESS;
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