package com.sy3.exa03;

import java.util.Vector;

public class Contacts {
	private StudentInfo students[] = new StudentInfo[100];
	private int Count = 0;
	public StudentInfo[] getStudents() {
		return students;
	}
	public void setStudents(StudentInfo[] students) {
		this.students = students;
	}
	public int getCount() {
		return Count;
	}
	public void setCount(int count) {
		Count = count;
	}
	public void append(StudentInfo student)
	{
		if(Count == 100)
			return;
		for (int i = 0; i < Count; i++) {
			if(student.stuId.equals(students[i].stuId))
			{
				return;
			}
		}
		students[Count++] = student;
	}
	public void update(StudentInfo newStudent,String stuId)
	{
		for (int i = 0; i < Count; i++) {
			if(stuId.equals(students[i].stuId))
			{
				students[i] = newStudent;
			}
		}
	}
	public void delete(String stuId)
	{
		for (int i = 0; i < Count; i++) {
			if(stuId.equals(students[i].stuId))
			{
				for (int j = i; j < Count-1; j++)
				{
					students[j] = students[j+1];
				}
				return;
			}
		}
	}
	public StudentInfo findByStuId(String stuId)
	{
		StudentInfo ret = null;
		for (int i = 0; i < Count; i++) {
			if(stuId.equals(students[i].stuId))
				ret =students[i];
		}
		return ret;
	}
	public StudentInfo[] findByClass(String stuClass)
	{
		
		Vector<StudentInfo> stuVector = new Vector<StudentInfo>();
		for (int i = 0; i < Count; i++) {
			if(stuClass.equals(students[i].stuClass))
				stuVector.add(students[i]);
		}
		return stuVector.toArray(new StudentInfo[stuVector.size()]);
	}
	public StudentInfo[] find()
	{
		return students;
	}
}
