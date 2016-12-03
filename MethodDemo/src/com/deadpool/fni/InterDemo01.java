package com.deadpool.fni;

interface Inter1{
	public static final int AGE = 100;
	public abstract void tell();
}

interface Inter2
{
	public abstract void say();
}

abstract class Abs1
{
	public abstract void print();
}

class A extends Abs1 implements Inter1,Inter2
{
	public void tell()
	{
		
	}
	public void say()
	{
		
	}
	public void print()
	{
		
	}
}

public class InterDemo01 {

	public static void main(String[] args) {
		 //Inter i = new Inter();
		//不允许。
		A a = new A();
		a.tell();
		System.out.println(Inter1.AGE);
		a.say();
	}

}
