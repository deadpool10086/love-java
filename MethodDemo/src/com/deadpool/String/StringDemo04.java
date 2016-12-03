package com.deadpool.String;

public class StringDemo04 {
	
	public static void main(String[] args) {
		String str = "I love deadpool!!!";
		System.out.println(str.length());
		char data[] = str.toCharArray();
		for (int i=0; i<data.length; i++)
		{
			System.out.print(data[i]+"*");
		}
		System.out.println("\n"+str.charAt(7));
		byte bytes[] = str.getBytes();
		for (int i=0; i<bytes.length; i++)
		{
			System.out.print(bytes[i]+"*");
		}
		System.out.println("\n"+str.indexOf("d"));
		
	}

}
