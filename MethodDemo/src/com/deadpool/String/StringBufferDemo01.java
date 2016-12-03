package com.deadpool.String;

public class StringBufferDemo01 {

	
	
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("hello");
		System.out.println(sbf.toString());
		sbf.insert(0, "i love");
		System.out.println(sbf.toString());
		sbf.replace(2, 4, "gg");
		System.out.println(sbf.toString());
	}

}
