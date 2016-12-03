package com.deadpool.method;

class Person3
{
	String name;
	private static String county = "北京";
	public Person3(String name)
	{
		this.name = name;
	}
	public static void setCounty(String county) {
		Person3.county = county;
	}
	public static String getCounty() {
		return county;
	}
	public void tell()
	{
		System.out.println("姓名："+name+" 出生地："+county);
	}
}

public class ClassDemo02 {

	
	public static void main(String[] args) {
		Person3.setCounty("上海");
		Person3 p1 = new Person3("张三");
		p1.tell();
		Person3 p2 = new Person3("李四");
		p2.tell();
		Person3 p3 = new Person3("王五");
		p3.tell();
	}

}
