package com.deadpool.dome;

public class CD extends Item{

	private String artist;
	private int numofTracks;
	

	
	public CD(String tittle, String artist, int numofTracks, int playingTime,
			String comment) {
		super(tittle, playingTime, comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		System.out.println("CD");
		super.print();
		System.out.println("director");	
	}

}
