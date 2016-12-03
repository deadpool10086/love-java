package po;

public class Question {

	private int questionid;
	private String questionname;
	private int questionscore;
	private String questionhref;
	private String questiontype;
	public Question(){}
	public Question(int questionid, String questionname, int questionscore,
			String questionhref, String questiontype) {
		super();
		this.questionid = questionid;
		this.questionname = questionname;
		this.questionscore = questionscore;
		this.questionhref = questionhref;
		this.questiontype = questiontype;
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
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
