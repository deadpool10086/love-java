package project;
import java.util.Scanner;
class Car {
	String sb = "";
	String xh = "";
	String xl = "";
	int xs=0;
	String ys = "";
	int ms=0;
	float pl=0.0F;
	float jg=0.0F;
	float kyhj=0.0F;
	float blhy=0.0F;
	int zgss=0;
	int zdgl=0;
	int nj=0;
	int jssj=0;
	int scjl=0;
	float jl=0.0F;
//	无参方法
	Car(){
	}
//	有参方法
	Car(String insb){
	sb=insb;
	}
	Car(String insb,String inxh){
	sb=insb;
	xh=inxh;
	}
	Car(String insb,String inxh,String inxl){
	sb=insb;
	xh=inxh;
	xl=inxl;
	}
	Car(String insb,String inxh,String inxl,int inxs){
	sb=insb;
	xh=inxh;
	xl=inxl;
	xs=inxs;
	}
	Car(String insb,String inxh,String inxl,int inxs,String inys){
	sb=insb;
	xh=inxh;
	xl=inxl;
	xs=inxs;
	ys=inys;
	}
	Car(String insb,String inxh,String inxl,int inxs,String inys,int inms){
	sb=insb;
	xh=inxh;
	xl=inxl;
	xs=inxs;
	ys=inys;
	ms=inms;
	}
	Car(String insb,String inxh,String inxl,int inxs,String inys,int inms,float inpl){
	sb=insb;
	xh=inxh;
	xl=inxl;
	xs=inxs;
	ys=inys;
	ms=inms;
	pl=inpl;
	}
	Car(String insb,String inxh,String inxl,int inxs,String inys,int inms,float inpl,float injg){
	sb=insb;
	xh=inxh;
	xl=inxl;
	xs=inxs;
	ys=inys;
	ms=inms;
	pl=inpl;
	jg=injg;
	}
	Car(String insb,String inxh,String inxl,int inxs,String inys,int inms,float inpl,float injg,float inkyhj){
	sb=insb;
	xh=inxh;
	xl=inxl;
	xs=inxs;
	ys=inys;
	ms=inms;
	pl=inpl;
	jg=injg;
	kyhj=inkyhj;
	}
	//输入汽车信息
    void info(){
	if(sb.equals(""))
		System.out.print("商标：未知\t");
	else
		System.out.print("商标："+sb+"\t");
	if(xh.equals(""))
		System.out.print("型号：未知\t");
	else
		System.out.print("型号："+xh+"\t");
	if(xl.equals(""))
		System.out.print("系列：未知\t");
	else
		System.out.print("系列："+xl+"\t");
	if(xs<=0)
		System.out.print("箱式：未知\t");
	else
		System.out.print("箱式："+xs+"\t");
	if(ys.equals(""))
		System.out.print("颜色：未知\t");
	else
		System.out.print("颜色："+ys+"\t");
	if(ms<=0)
		System.out.print("门数：未知\t");
	else
		System.out.print("门数："+ms+"\t");
	if(pl<=0)
		System.out.print("排量：未知\t");
	else
		System.out.print("排量："+pl+"\t");
	if(jg<=0)
		System.out.print("价格：未知\t");
	else
		System.out.print("价格："+jg+"\t");
	if(kyhj<=0)
		System.out.print("可优惠价：未知\t");
	else
		System.out.print("看优惠价："+kyhj+"\t");
	System.out.println();
	}
    float zhyl(float blhy,float jl){
    	this.blhy=blhy;
    	this.jl=jl;
    	float a;
    	a=(jl/100)*blhy;
    	return a;
    }
}

public class L04_04_HellowJava {
	
	public static void main(String[] args) {
		Car c0= new Car("");
		c0.info();
		Car c1=new Car("宝马");
		c1.info();
		Car c2=new Car("宝马","越野");
        c2.info();
        //计算
        float blhy,jl;
        Car a=new Car();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入百里耗油量：");
        blhy=sc.nextFloat();
        System.out.println("请输入行驶路程：");
        jl=sc.nextFloat();
        a.zhyl(blhy, jl);
        System.out.print("耗油量为："+a.zhyl(blhy,jl));
        sc.close();
	}

}
