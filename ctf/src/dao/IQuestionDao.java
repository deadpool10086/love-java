package dao;

import po.News;
import po.Question;
import po.Score;

public interface IQuestionDao {

	public Question Add(String questionname,int questionscore,String questionhref,String questiontype);
	
}
