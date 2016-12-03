package com.deadpool.extend;

class Z 
{
	public void tell()
	{
		System.out.println("我是z");
	}
}

class A
{
	public void tell()
	{
		System.out.println("我是tell");
	}
}

class B extends A
{
	public void tell()
	{
		super.tell();
		System.out.println("我重写了tell");
	}
}


public class ExtendsDwmo04 {

	public static void main(String[] args) {
		B b = new B();
		b.tell();
	}

}
