 package com.deadpool.dome;

public class Item {

	private  String tittle;
	private int playingTime;
	private boolean gotIt = false;
	private String comment;
	


	public Item(String tittle, int playingTime, String comment) {
		super();
		this.tittle = tittle;
		this.playingTime = playingTime;
		this.comment = comment;
	}



	public void print() {
		System.out.println(tittle);
	}

}
