package outher;
import java.util.Scanner;
class rectangle{
	int length;
	int width;
	rectangle(int inL,int inW){
		length=inL;
		width=inW;
	}
	public int area(int inL,int inW){
		length=inL;
		width=inW;
		return length*width;
	}
	public int perimeter(int inL,int inW){
		length=inL;
		width=inW;
		return 2*(length+width);
	}
}
class triangle{
	double sidea;
	double sideb;
	double sidec;
	triangle(double da,double db,double dc){
		sidea=da;
		sideb=db;
		sidec=dc;
	}
	public double perimeter(double da,double db,double dc){
		sidea=da;
		sideb=db;
		sidec=dc;
		return sidea+sideb+sidec;
	}
	public double area(double da,double db,double dc){
		double sum;
		sidea=da;
		sideb=db;
		sidec=dc;
		sum=(sidea+sideb+sidec)/2;
		return Math.sqrt(sum*(sum-sidea)*(sum-sideb)*(sum-sidec));
	}
}
class circle{
	double radius;
	circle(double dr){
		radius=dr;
	}
	public double area(double dr){
		radius=dr;
		return 2*Math.PI*radius;
	}
	public double perimeter(double dr){
		radius=dr;
		return Math.PI*radius*radius;
	}
}

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter=' ';
		System.out.print("请输入想要构造的图形r-长方形，t-三角形，c-圆"+letter);
		Scanner ss=new Scanner(System.in);
		letter=ss.next().charAt(0);
		switch(letter){
			case 'r':
				int length=0;
				int width=0;
				Scanner sc=new Scanner(System.in);
				rectangle rect=new rectangle(length,width);
				System.out.print("请输入长方形的长（整数）：");
				length=sc.nextInt();
				System.out.print("请输入长方形的宽（整数）：");
				width=sc.nextInt();
				rect=new rectangle(length,width);
				System.out.print("长方形的周长："+rect.perimeter(length,width));
				System.out.print("长方形的面积："+rect.area(length,width));
				break;
			case 't':
				double sidea=0;
				double sideb=0;
				double sidec=0;
				Scanner sr=new Scanner(System.in);
				triangle tri=new triangle(sidea,sideb,sidec);
				System.out.print("请输入三角形的第一条边a：");
				sidea=sr.nextDouble();
				System.out.print("请输入三角形的第二条边b：");
				sidea=sr.nextDouble();
				System.out.print("请输入三角形的第三条边c：");
				sidea=sr.nextDouble();
				tri=new triangle(sidea,sideb,sidec);
				System.out.print("三角形的周长："+tri.perimeter(sidea,sideb,sidec));
				System.out.print("三角形形的面积："+tri.area(sidea,sideb,sidec));
				break;
			case 'c':
				double radius=0;
				Scanner st=new Scanner(System.in);
				circle cir=new circle(radius);
				System.out.print("请输入圆的半径：");
				radius=st.nextDouble();
				cir=new circle(radius);
				System.out.print("圆的周长："+cir.perimeter(radius));
				System.out.print("圆的面积："+cir.area(radius));
				break;
			default:
				System.out.print("输入得字符不正确");
		}
	}

}