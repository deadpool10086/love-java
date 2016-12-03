package com.deadpool.pol;

class A
{
	public void tell1()
	{
		System.out.println("A--tell1");
	}
	public void tell2()
	{
		System.out.println("A--tell2");
	}
}
class B extends A
{
	public void tell1()
	{
		System.out.println("B--tell1");
	}
	public void tell3()
	{
		System.out.println("B--tell3");
	}
}

public class PolDemo01 {


	public static void main(String[] args) {
		B b = new B();
		A a = b;
		a.tell1();
		a.tell2();
		A a1 = new B();
		A a2 = new A();
		System.out.println(a2 instanceof A);
		System.out.println(a2 instanceof B);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		B b1 = (B)a1;
		b1.tell1();
		b1.tell2();
		b1.tell3();
		
	}

}
