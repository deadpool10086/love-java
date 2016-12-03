package com.deadpool.pol;

class A01
{
	public void tell1()
	{
		System.out.println("A1->tell1");
	}
}
class B01 extends A01
{
	public void tell2()
	{
		System.out.println("B1->tell1");
	}
}
class C01 extends B01
{
	public void tell3()
	{
		System.out.println("C1->tell1");
	}
}


public class PolDemo02 {


	public static void main(String[] args) {
		say(new A01());
		say(new B01());
		say(new C01());
	}
	public static void say(A01 a)
	{
		a.tell1();
	}
}
