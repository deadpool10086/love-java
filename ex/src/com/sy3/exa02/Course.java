package com.sy3.exa02;

public class Course {
	private String courID = new String();
	private String courName = new String();
	private double courCredit = 0;
	private int courHours = 0;
	private String courtype = new String();
	private static int passingScore = 60;
	public Course(String courID, String courName, double courCredit,
			int courHours, String courtype) {
		super();
		this.courID = courID;
		this.courName = courName;
		this.courCredit = courCredit;
		this.courHours = courHours;
		this.courtype = courtype;
	}
	public Course() {
		super();
	}
	public String getCourID() {
		return courID;
	}
	public void setCourID(String courID) {
		this.courID = courID;
	}
	public String getCourName() {
		return courName;
	}
	public void setCourName(String courName) {
		this.courName = courName;
	}
	public double getCourCredit() {
		return courCredit;
	}
	public void setCourCredit(double courCredit) {
		this.courCredit = courCredit;
	}
	public int getCourHours() {
		return courHours;
	}
	public void setCourHours(int courHours) {
		this.courHours = courHours;
	}
	public String getCourtype() {
		return courtype;
	}
	public void setCourtype(String courtype) {
		this.courtype = courtype;
	}
	public static int getPassingScore() {
		return passingScore;
	}
	public static void setPassingScore(int passingScore) {
		Course.passingScore = passingScore;
	}
	@Override
	public String toString() {
		return courID+"\t"+ courName+"\t" + courCredit+"\t" + courHours+"\t" + courtype;
	}
	
	
		
}
