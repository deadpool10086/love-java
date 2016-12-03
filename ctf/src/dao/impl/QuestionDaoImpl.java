package dao.impl;

import po.News;
import po.Question;
import po.Score;

import dao.INewsDao;
import dao.IQuestionDao;
import dao.IScoreDao;
import dbutil.DBConn;

public class QuestionDaoImpl implements IQuestionDao {
	 DBConn db=null;
	    public QuestionDaoImpl(){
	    	db=new DBConn();
	    }
	public Question Add(String questionname,int questionscore,String questionhref,String questiontype) {
		Question question=new Question();
	   
			String sql="insert into question(questionname,questionscore,questionhref,questiontype)values(?,?,?,?)";
	        db.executeUpdate(sql, new Object[]{questionname,questionscore,questionhref,questiontype});
		
		return question;
	}

}
