package outher;
import java.util.Scanner;

class Student{
	int xh;
	String xm;
	int gs;
	int java;
	int yy;
	Student(){
		xh=0;
		xm="";
		gs=0;
		java=0;
		yy=0;
	}
	//setter（）方法
	public void setxh(int xh){
		this.xh=xh;
	}
	
	public void setxm(String xm){
		this.xm=xm;
	}
	
	public void setgs(int gs){
		this.gs=gs;
	}
	
	public void setjava(int java){
		this.java=java;
	}
	
	public void setyy(int yy){
		this.yy=yy;
	}
	//getter()方法
	public int getxh(){
		return xh;
	}
	
	public String getxm(){
		return xm;
	}
	
	public int getgs(){
		return gs;
	}
	
	public int getjava(){
		return java;
	}
	
	public int getyy(){
		return yy;
	}
	
	public void print() {
		System.out.print(xh + "\t" + xm + "\t" + gs + "\t" + java + "\t" + yy);
	}
	public double aver(){
		double a;
		a=(gs+java+yy)/3.0;
		return  a;
	}
}

public class L03_12_HelloJava {

	
	public static void main(String[] args) {
		int i;
		int j;
		int n=2;
		
		Student Stu[] = new Student[20];
		Scanner a=new Scanner(System.in); 
		
		for(i=0;i<n;i++){
			Stu[i] = new Student();
			
			System.out.print("请输入学生学号：");
		    int xuehao = a.nextInt();
			Stu[i].setxh(xuehao);
			
			System.out.print("请输入学生的姓名： ");
			String name = a.next();
			Stu[i].setxm(name);
			
			System.out.print("请输入高数成绩： ");
			int math = a.nextInt();
			Stu[i].setgs(math);

			System.out.print("请输入学生的java成绩： ");
			int jav = a.nextInt();
			Stu[i].setjava(jav);

			System.out.print("请输入学生的英语成绩：");
			int English = a.nextInt();
			Stu[i].setyy(English);

			System.out.println();
		}
		
		for (i = 0; i < n; i++) {
			Stu[i].print();
			System.out.println("\t"+ Stu[i].aver());		
			System.out.println();
		}
		
		for( i=0;i<n-1;i++)
			for( j=0;j<n-i-1;j++)
				if(Stu[j].aver()>Stu[j+1].aver()){ 
					Student stu = new Student();
					stu=Stu[j];
					Stu[j]=Stu[j+1];
					Stu[j+1]=stu;
				}
		
		
		System.out.print("请输入要查找学生的学号或姓名:  ");
		String xh_Or_xm = a.next();
		
		for(i = 0; i < n; i ++){
			
			if (xh_Or_xm.equals(Stu[i].getxm()) ||
					xh_Or_xm.equals(String.valueOf(Stu[i].getxh())) ){
				Stu[i].print();
				System.out.println("\t" + Stu[i].aver());
				System.out.println("该学生为第 " + i + "名");
			}
		}
		a.close();
}
}
