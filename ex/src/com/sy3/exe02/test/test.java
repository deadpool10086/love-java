package com.sy3.exe02.test;

import com.sy3.exa02.Course;

public class test {

	public static void main(String[] args) {
		Course courses[] = new Course[6];
		courses[0] = new Course("E052026","Linux操作系统",3,56,"专业选修");
		courses[1] = new Course("S052005","面向对象程序设计",3.5,56,"专业教育");
		courses[2] = new Course("S052006","面向对象程序设计实验",1,32,"专业教育");
		courses[3] = new Course("S052037","数据库原理及应用",3,48,"专业选修");
		courses[4] = new Course("S052011","数据库原理及应用实验",1,32,"专业选修");
		courses[5] = new Course("S052049","操作系统",4,64,"专业选修");
		printCoutses(courses);
	}

	public static void printCoutses(Course[] courses)
	{
		for(Course c:courses )
		{
			System.out.println(c);
		}
	}
}

