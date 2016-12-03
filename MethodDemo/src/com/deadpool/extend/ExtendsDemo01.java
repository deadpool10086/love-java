package com.deadpool.extend;

class Person
{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void tell()
	{
		System.out.println("姓名："+getName()+" 年龄："+getAge());
	}
}
class Student extends Person
{
/*	private String name;
	private float score;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
*/
	private float score;

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	public void say()
	{
		System.out.println("成绩"+getScore());
	}
}

public class ExtendsDemo01 {



	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(20);
		s.setName("张三");
		s.setScore(100);
		s.tell();
		s.say();

	}

}
