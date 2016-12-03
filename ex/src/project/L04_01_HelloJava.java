package project;
import java.util.Scanner;
class sjx{
	 private double a,b,c;

	 
	 public sjx(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	 
	public double aera(double a1,double b2,double c3){
		 a=a1;
		 b=b2;
		 c=c3;
		 double s;
		 s=0.5*(a+b+c);
		 return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	public double pertemeter(double a1,double b2,double c3){
		a=a1;
		b=b2;
		c=c3;
		return (a+b+c);
	}
}

class cfx{
		int length;
		int width;
		cfx(int a,int b){
			length=a;
			width=b;
		}
		 public int aera(int a,int b){
			 length=a;
			width=b;
			 return length*width;
		}
		public int pertemeter(int a,int b){
			length=a;
			width=b;
			return 2*(length+width);
		}
		
	}

class y{
	int radius;
	final int PI=3;
	y(int a){
		radius=a;
	}
	
	public int aera(int b){
		radius=b;
		 return radius*radius*PI;
	}
	
	public int pertemeter(int b){
		radius=b;
		return PI*radius*2;
	}
}
public class L04_01_HelloJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		int length;
		int width;
		int radius;
		Scanner sc=new Scanner(System.in);
        //等边三角形
		System.out.print("请输入三角形的边：");
		a=sc.nextDouble();
		System.out.print("请输入三角形的边：");
		b=sc.nextDouble();
		System.out.print("请输入三角形的边：");
		c=sc.nextDouble();
		sjx rect=new sjx(a,b,c);
		System.out.print("三角形的面积："+rect.aera(a,b,c)+"\t");
		System.out.println("周长："+rect.pertemeter(a,b,c));
		//长方形
		System.out.print("请输入长方形的长：");
		length=sc.nextInt();
		System.out.print("请输入长方形的宽：");
		width=sc.nextInt();
		cfx ah=new cfx(length,width);
		System.out.print("长方形的面积："+ah.aera(length,width)+"\t");
		System.out.println("周长："+ah.pertemeter(length,width));
		//圆
		System.out.print("请输入圆的半径：");
		radius=sc.nextInt();
		y bh=new y(radius);
		System.out.print("等边三角形的面积："+bh.aera(radius)+"\t");
		System.out.println("周长："+bh.pertemeter(radius));
		sc.close();

	}

}
