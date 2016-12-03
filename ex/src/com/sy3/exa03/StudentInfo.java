package com.sy3.exa03;

public class StudentInfo {
	public String stuId= new String();
	public String stuName = new String();
	public char stuSex;
	public String stuBirth = new String();
	public String stuClass = new String();
	public String stuTel = new String();
	public String stuQQ = new String();
	public StudentInfo() {
		super();
	}
	public StudentInfo(String stuId, String stuName, char stuSex, String stuClass) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuClass = stuClass;
	}
	public StudentInfo(String stuId, String stuName, char stuSex, String stuBirth,
			String stuClass, String stuTel, String stuQQ) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuBirth = stuBirth;
		this.stuClass = stuClass;
		this.stuTel = stuTel;
		this.stuQQ = stuQQ;
	}
	@Override
	public String toString() {
		return stuId+ "\t" +stuName+ "\t" +stuSex+ "\t" +stuBirth+ "\t" +stuClass+ "\t" +stuTel
		+ "\t" +stuQQ; 
	}
	
	
}
