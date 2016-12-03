package com.deadpool.String;

public class StringDemo01 {


	public static void main(String[] args) {
		String str = "Hello";
		String str1 = new String("Hello");
		System.out.println(str + str1);
		System.out.println(str.equals(str1));
		str += " world!"; //str 将会指向新的地址其hello并未改变
		System.out.println(str);
	}

}
