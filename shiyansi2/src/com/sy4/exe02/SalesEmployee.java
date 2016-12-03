package com.sy4.exe02;

public class SalesEmployee extends Employee {
	
	int saleMoney;
	
	int rate;

	public SalesEmployee(String name, int age, String sex, String empid,
			float salary, int saleMoney, int rate) {
		super(name,age,sex,empid,salary);
		this.saleMoney = saleMoney;
		this.rate = rate;
	}

	public float getSalary() {
		float c;
		c = salary+(float)((saleMoney*0.01*rate));
		return c;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getSaleMoney() {
		return saleMoney;
	}

	public void setSaleMoney(int saleMoney) {
		this.saleMoney = saleMoney;
	}
	
//    public void role() {
//		
//		System.out.println("����:"+getName()+"�Ա�:"+getSex()+"����:"+"нˮ:"+salary(10000,180,4)+"ְ�����:"+empid);
//	} 
    
}
