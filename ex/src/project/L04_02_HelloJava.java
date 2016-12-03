package project;

import java.util.*;

class slz{
	 private double a,b,c,h;

	 
	 public slz(double a, double b, double c,double h) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}
	public double bmj(double a1,double b2,double c3){
		 a = a1;
		 b = b2;
		 c = c3;
		 double s;
		 s = 0.5*(a+b+c);
		 return (Math.sqrt(s*(s-a)*(s-b)*(s-c)))*4;
	}
	
	public double tj(double a1,double b2,double c3,double h4){
		a = a1;
		b = b2;
		c = c3;
		h = h4;
		double s;
		s = 0.5*(a+b+c);
		return Math.sqrt(s*(s-a)*(s-b)*(s-c))*h;
	}
}

class cft{
	int length;
	int width;
	int hight;
	cft(int a,int b,int c){
		length = a;
		width = b;
		hight = c;
	}
	 public int tj(int a,int b,int c){
		length = a;
		width = b;
		hight = c;
		 return length*width*hight;
	}
	public int bmj(int a,int b,int c){
	    length=a;
		width=b;
		hight=c;
		return 2*(length*width)+2*(length*hight)+2*(width*hight);
	}
	
}

//class qtz{
//	int r1;
//	int r2;
//	int h;
//	qtz(int a,int b,int c){
//		
//		r1=a;
//		r2=b;
//		h=c;
//		
//	}
//	public double tj(int a1,int b2,int c3){
//		r1=a1;
//		r2=b2;
//		h=c3;
//		
//		return
//	}
//}
class q{
	int radius;
	q(int a){
		radius=a;
	}
	
	public double tj(int b){
		radius=b;
		return Math.PI*radius*radius*radius*(4/3);
	}
	public double bmj(int b){
		radius=b;
		return Math.PI*radius*4*radius;
	}
}


public class L04_02_HelloJava {

	public static void main(String[] args) {
		      
		double a,b,c,h; 
		int length= 0;
		int width=0;
		int hight=0;
		int radius=0;
		Scanner sc = new Scanner(System.in);
		//三棱锥
		System.out.print("请输入三棱锥的第一条边：");
		a=sc.nextDouble();
		System.out.print("请输入三棱锥的第二条边：");
		b=sc.nextDouble();
		System.out.print("请输入三棱锥的第三条边：");
		c=sc.nextDouble();
		System.out.print("请输入三棱锥的高：");
		h=sc.nextDouble();
		System.out.println();
		slz rect = new slz(a,b,c,h);
		System.out.print("三棱锥的体积："+rect.tj(a, b, c, h));
		System.out.println("三棱锥的表面积："+rect.bmj(a, b, c));
		//长方体
		System.out.print("请输入长方体的长：");
		length = sc.nextInt();
		System.out.print("请输入长方体的宽：");
		width = sc.nextInt();
		System.out.print("请输入长方体的高：");
		hight = sc.nextInt();
		cft rec = new cft(length,width,hight);
		System.out.print("长方体的体积："+rec.tj(length, width, hight));
		System.out.println("长方体的表面积："+rec.bmj(length, width, hight));
		//球
		System.out.print("请输入球的半径：");
		radius = sc.nextInt();
		q re = new  q(radius);
		System.out.print("球的体积："+re.tj(radius));
		System.out.println("球的表面积："+re.bmj(radius));
		
		sc.close();
	}
       
}
