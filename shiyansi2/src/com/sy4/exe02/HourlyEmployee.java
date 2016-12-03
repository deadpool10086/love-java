package com.sy4.exe02;

public class HourlyEmployee extends Employee {
	
	int hourSalary;
	
	int hourWork;

	public HourlyEmployee() {
		super();
	}

	public HourlyEmployee(String name, int age, String sex, String empid,
			float salary, int hourSalary, int hourWork) {
		super(name,age,sex,empid,salary);
		this.hourSalary = hourSalary;
		this.hourWork = hourWork;
	}

	public float getSalary() {
		float c;
    	c = salary+(float)((hourSalary - 160)*1.5*hourWork+160*hourWork);
		return c;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
//    public void role() {
//		
//		System.out.println("����:"+getName()+"�Ա�:"+getSex()+"����:"+"нˮ:"+salary(180,50)+"ְ�����:"+empid);
//	} 
    
}
