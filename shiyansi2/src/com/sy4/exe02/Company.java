package com.sy4.exe02;

public class Company {

	public static void print(Employee e){
		 
		 System.out.print("姓名:"+e.getName()+"\t");
		 System.out.print("年龄:"+e.getAge()+"\t");
		 System.out.print("性别:"+e.getSex()+"\t");
		 System.out.print("编号:"+e.getEmpid()+"\t");
		 System.out.println("工资:"+e.getSalary());
		
	}
}
