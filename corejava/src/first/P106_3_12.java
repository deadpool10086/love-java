package Homework;
import java.util.*;
public class P106_3_12 {

	public static void main(String[] args) {
		        int x=0;
		        int i;
		        boolean find=false;
				Scanner sc=new Scanner(System.in);
				System.out.println("请输入学生个数");
		        x=sc.nextInt();
				int[] ID=new int[x];
			    String[] name=new String[x];
			    double[] math=new double[x];
			    double[] java=new double[x];
			    double[] English=new double[x];
			    System.out.println("请输入学生信息：");
			    System.out.println("学号    姓名    高数成绩    java成绩  英语成绩");
			    for(i=0;i<x;i++){
			    	System.out.println("第"+(i+1)+"个学生信息：");
			    	ID[i]=sc.nextInt();
			    	name[i]=sc.next();
			    	math[i]=sc.nextDouble();
			    	java[i]=sc.nextDouble();
			    	English[i]=sc.nextDouble();
			    }
			    double[] aver=new double[x];
			    System.out.println();
			    for(i=0;i<x;i++){
			    	System.out.println("第"+(i+1)+"个学生信息：");
			    	System.out.println("学号                                               "+ID[i]);
			    	System.out.println("姓名                                               "+name[i]);
			    	System.out.println("高数成绩                                      "+math[i]);
			    	System.out.println("《JAVA程序设计》成绩      "+java[i]);
			    	System.out.println("英语成绩                                      "+English[i]);
			    	aver[i]=(math[i]+java[i]+English[i])/3.0;
			    	System.out.println("三门课平均成绩                         "+aver[i]);
			    }
			    
		
			    System.out.println();
			    Arrays.sort(aver);
			    System.out.println(x+"个学生的排名如下：");
			    for(i=x-1;i>=0;i--){
			    	System.out.println("第"+(i+1)+"名： "+name[i]+"  平均成绩： "+aver[i]);
			    }
			    
			    System.out.println();
			    String y;
			    int index=0;
			    System.out.println("请输入要查找学生的姓名：");
			    y=sc.next();
			    for(i=0;i<x;i++){
			    	if(y.equals(name[i])){
			    		find=true;
			    		index=i;
			    		break;
			    	}
			    }
			    System.out.println();
			    if(!find){
			    	System.out.println("没有查找到该学生");
			    }
			    else{
			    	System.out.println("姓名为"+y+"的学生信息如下");
			    	System.out.println("学号                 "+ID[index]);
			    	System.out.println("姓名                 "+name[index]);
			    	System.out.println("高数成绩        "+math[index]);
			    	System.out.println("JAVA成绩    "+java[index]);

			    	System.out.println("英语成绩         "+English[index]);
			    }
		}

}
