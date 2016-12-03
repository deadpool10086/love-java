package com.sy3.exe03.test;

import java.util.Scanner;

import com.sy3.exa03.Contacts;
import com.sy3.exa03.StudentInfo;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contacts contacts = new Contacts();
		int n = 0;
		
		String stuId= new String();
		String stuName = new String();
		char stuSex;
		String stuBirth = new String();
		String stuClass = new String();
		String stuTel = new String();
		String stuQQ = new String();
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你想输入的学生");
		n = in.nextInt();
		StudentInfo newStu[] = new StudentInfo[100]; //新建学生数组
		
		for(int i=0; i<n; i++)
		{
			stuId = in.next();
			stuName = in.next();
			stuSex = in.next().charAt(0);
			stuBirth = in.next();
			stuClass = in.next();
			stuTel = in.next();
			stuQQ = in.next();
			newStu[i] = new StudentInfo(stuId, stuName, stuSex, stuBirth, stuClass, stuTel, stuQQ);
		}
		contacts.setStudents(newStu);
		contacts.setCount(n);
		while(n!=0)
		{
			System.out.println("请输入功能,1添加学生，2根据学号修改,3根据学号删除,4根据学号查找,5查找某个班级,6查找全部");
			n = in.nextInt();
			switch (n) {
			case 1:
				stuId = in.next();
				stuName = in.next();
				stuSex = in.next().charAt(0);
				stuBirth = in.next();
				stuClass = in.next();
				stuTel = in.next();
				stuQQ = in.next();
				contacts.append(new StudentInfo(stuId, stuName, stuSex, stuBirth, stuClass, stuTel, stuQQ));
				break;
			case 2:
				stuId = in.next();
				stuName = in.next();
				stuSex = in.next().charAt(0);
				stuBirth = in.next();
				stuClass = in.next();
				stuTel = in.next();
				stuQQ = in.next();
				System.out.println("输入要修改的学号");
				contacts.update(new StudentInfo(stuId, stuName, stuSex, stuBirth, stuClass, stuTel, stuQQ), in.next());
				break;
			case 3:
				System.out.println("输入要修改的学号");
				contacts.delete(in.next());
				break;
			case 4:
				System.out.println("输入要修改的学号");
				System.out.println(contacts.findByStuId(in.next()));
				break;
			case 5:
				{
					System.out.println("输入班级");
					StudentInfo stemp[] = contacts.findByClass(in.next());
					for(StudentInfo s:stemp)
					{
						System.out.println(s);
					}
					break;
				}
			case 6:
				StudentInfo stemp[] = contacts.find();
				for(int i=0; i<contacts.getCount(); i++)
				{
					System.out.println(stemp[i]);
				}
				break;
			default:
				break;
			}
		}
		
	//	System.out.println(newStu);
		
		in.close();
	}

}
