package com.sy4.exe02;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(String name, int age, String sex, String empid,
			float salary) {
		super(name,age,sex,empid,salary);
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
//    public void role() {
//		
//		System.out.println("姓名:"+getName()+"性别:"+getSex()+"年龄:"+"薪水:"+salary+"职工编号:"+empid);
//	} 
}
