package com.deadpool.fni;

abstract class Abs
{
	private int age;
	public void tell()
	{
		
	}
	public abstract void say();
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
}
class AbsDemo extends Abs
{
	public void say()
	{
		System.out.println(this.getAge());
	}
}

public class AbsDemo01 {


	public static void main(String[] args) {
	//不允许 
//		Abs abs = new Abs()
		AbsDemo a  = new AbsDemo();
		a.setAge(20);
		a.say();
	}

}
