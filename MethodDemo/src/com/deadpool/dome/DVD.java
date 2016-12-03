package com.deadpool.dome;

public class DVD extends Item{


	private String director;
	
	public DVD(String tittle, String director, int playingTime, String comment) {
		super(tittle, playingTime, comment);
		this.director = director;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public void print() {
		System.out.println("DVD");
		super.print();
		System.out.println("director");	
	}
}
