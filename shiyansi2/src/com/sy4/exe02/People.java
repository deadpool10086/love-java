package com.sy4.exe02;

public abstract class People {

	private String name;
	
	private int age;
	
	private String sex;
//构造方法
	public People() {
		super();
	}

	public People(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
    public abstract void role();

	
}
