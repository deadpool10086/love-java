package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.IQuestionDao;
import dao.impl.QuestionDaoImpl;

public class AddQuestionAction extends ActionSupport {
	private String questionname;
	private int questionscore;
	private String questionhref;
	private String questiontype;
	
	public String execute()
	{
		IQuestionDao questionDao=new QuestionDaoImpl();
		questionDao.Add(questionname, questionscore, questionhref, questiontype);
		return SUCCESS;
	}

	public String getQuestionname() {
		return questionname;
	}

	public void setQuestionname(String questionname) {
		this.questionname = questionname;
	}

	public int getQuestionscore() {
		return questionscore;
	}

	public void setQuestionscore(int questionscore) {
		this.questionscore = questionscore;
	}

	public String getQuestionhref() {
		return questionhref;
	}

	public void setQuestionhref(String questionhref) {
		this.questionhref = questionhref;
	}

	public String getQuestiontype() {
		return questiontype;
	}

	public void setQuestiontype(String questiontype) {
		this.questiontype = questiontype;
	}
	
	

}
