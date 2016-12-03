package com.sy3.exe01.text;

import java.util.Scanner;

import com.sy3.exa01.Cube;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入长宽高");
		int height = 0;
		int width = 0;
		int length = 0;
		height = in.nextInt();
		width = in.nextInt();
		length = in.nextInt();
		Cube cube = new Cube(length, width, height);
		System.out.println("面积："+cube.getArea()+"体积:"+cube.getVolum());
		in.close();
	}


}
