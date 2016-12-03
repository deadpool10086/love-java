package com.sy4.exe02.test;

import com.sy4.exe02.Company;
import com.sy4.exe02.Employee;
import com.sy4.exe02.HourlyEmployee;
import com.sy4.exe02.SalariedEmployee;
import com.sy4.exe02.SalesEmployee;

public class CompanyTest {

	public static void main(String[] args) {
		
		Employee data[] = new Employee[3];
		
		data[0] = new SalariedEmployee("С��",18,"Ů","10010",10000);
		data[1] = new HourlyEmployee("С��",28,"��","10012",10000,180,40);
		data[2] = new SalesEmployee("С��",39,"��","13010",11000,18000,1);

		for(Employee v:data)
		{
			Company.print(v);
			System.out.println();
		}
	}

}
