package com.sy3.exa01;


public class Cube {
	private int length;
	private int width;
	private int height;
	
	
	public int setCub(int length, int width, int height)
	{
		this.length = length;
		this.width = width;
		this.height = height;
		return 0;
	}
	public Cube(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public int getArea()
	{
		return (length*width+width*height+height*length)*2;
	}

	public int getVolum()
	{
		return length*height*width;
	}
}
