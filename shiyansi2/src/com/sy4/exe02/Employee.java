package com.sy4.exe02;

public class Employee extends People {

	 String empid;
	
	 float salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, int age, String sex,String empid, float salary) {
		super(name,age,sex); 
		this.empid = empid;
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}
	
	public void role() {
		
		System.out.println("姓名:"+getName()+"性别:"+getSex()+"年龄:"+"薪水:"+salary+"职工编号:"+empid);
	}

}
