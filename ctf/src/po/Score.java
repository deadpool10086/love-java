package po;

public class Score {

	private String membername;
	private int  questionid;
	private Double score;
	
	public Score(){}

	public Score(String membername, int questionid, Double score) {
		super();
		this.membername = membername;
		this.questionid = questionid;
		this.score = score;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	

}