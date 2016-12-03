package com.deadpool.method;

class Person
{
	String name;
	int age;
	public void tell()
	{
		System.out.println("姓名："+name+" "+"性别："+age);
	}
}

public class ClassDemo01 {


	public static void main(String[] args) {
		Person person = null;
		person = new Person();
		Person per = new Person();
		per.name = "张三";
		per.age = 10;
		per.tell();
		person.tell();
	}

}
