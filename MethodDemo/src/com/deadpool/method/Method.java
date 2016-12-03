package com.deadpool.method;

class Person2
{
	String name;
	public Person2()
	{
		this.name = "张三";
	}
}

public class Method {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a+" "+b);
		jiaohuan(a,b);
		System.out.println(a+" "+b);
		Person2 person = new Person2();
		System.out.println(person.name);
		change(person);
		System.out.println(person.name);
	}
	public static void jiaohuan(int a, int b)
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a+" "+b);
	}
	public static void change(Person2 a)
	{
		a.name = "赵四";
	}
}
