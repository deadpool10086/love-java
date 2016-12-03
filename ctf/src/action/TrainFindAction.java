package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import po.Fcomment;
import po.Forum;
import po.Lcomment;
import po.Learn;
import po.Train;

import com.opensymphony.xwork2.ActionSupport;

import dao.IFcommentDao;
import dao.IForumDao;
import dao.ILcommentDao;
import dao.ILearnDao;
import dao.ITrainDao;
import dao.impl.FcommentDaoImpl;
import dao.impl.ForumDaoImpl;
import dao.impl.LcommentDaoImpl;
import dao.impl.LearnDaoImpl;
import dao.impl.TrainDaoImpl;

public class TrainFindAction extends ActionSupport {
	private int trainid;
	HttpServletResponse response = ServletActionContext.getResponse();

	HttpServletRequest request = ServletActionContext.getRequest();

	public String execute() throws Exception {

		ITrainDao trainDao = new TrainDaoImpl();

		List<Train> tList = trainDao.Find(trainid);

		request.setAttribute("tlist", tList);

		return SUCCESS;
	}

	public int getTrainid() {
		return trainid;
	}

	public void setTrainid(int trainid) {
		this.trainid = trainid;
	}

}
