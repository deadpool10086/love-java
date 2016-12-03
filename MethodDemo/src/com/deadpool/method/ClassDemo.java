package com.deadpool.method;

class Person1
{
	private String name_;
	private int age_;

	public String getName_() {
		return name_;
	}

	public void setName_(String name_) {
		this.name_ = name_;
	}

	public int getAge_() {
		return age_;
	}

	public void setAge_(int age_) {
		this.age_ = age_;
	}

}

public class ClassDemo {

	public static void main(String[] args) {
		Person1 person = new Person1();
		person.setName_("张三");
		person.setAge_(8);
		System.out.println("我叫："+person.getName_()+"今年："+person.getAge_()+"岁" );
	}

}
