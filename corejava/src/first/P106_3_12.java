package Homework;
import java.util.*;
public class P106_3_12 {

	public static void main(String[] args) {
		        int x=0;
		        int i;
		        boolean find=false;
				Scanner sc=new Scanner(System.in);
				System.out.println("������ѧ������");
		        x=sc.nextInt();
				int[] ID=new int[x];
			    String[] name=new String[x];
			    double[] math=new double[x];
			    double[] java=new double[x];
			    double[] English=new double[x];
			    System.out.println("������ѧ����Ϣ��");
			    System.out.println("ѧ��    ����    �����ɼ�    java�ɼ�  Ӣ��ɼ�");
			    for(i=0;i<x;i++){
			    	System.out.println("��"+(i+1)+"��ѧ����Ϣ��");
			    	ID[i]=sc.nextInt();
			    	name[i]=sc.next();
			    	math[i]=sc.nextDouble();
			    	java[i]=sc.nextDouble();
			    	English[i]=sc.nextDouble();
			    }
			    double[] aver=new double[x];
			    System.out.println();
			    for(i=0;i<x;i++){
			    	System.out.println("��"+(i+1)+"��ѧ����Ϣ��");
			    	System.out.println("ѧ��                                               "+ID[i]);
			    	System.out.println("����                                               "+name[i]);
			    	System.out.println("�����ɼ�                                      "+math[i]);
			    	System.out.println("��JAVA������ơ��ɼ�      "+java[i]);
			    	System.out.println("Ӣ��ɼ�                                      "+English[i]);
			    	aver[i]=(math[i]+java[i]+English[i])/3.0;
			    	System.out.println("���ſ�ƽ���ɼ�                         "+aver[i]);
			    }
			    
		
			    System.out.println();
			    Arrays.sort(aver);
			    System.out.println(x+"��ѧ�����������£�");
			    for(i=x-1;i>=0;i--){
			    	System.out.println("��"+(i+1)+"���� "+name[i]+"  ƽ���ɼ��� "+aver[i]);
			    }
			    
			    System.out.println();
			    String y;
			    int index=0;
			    System.out.println("������Ҫ����ѧ����������");
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
			    	System.out.println("û�в��ҵ���ѧ��");
			    }
			    else{
			    	System.out.println("����Ϊ"+y+"��ѧ����Ϣ����");
			    	System.out.println("ѧ��                 "+ID[index]);
			    	System.out.println("����                 "+name[index]);
			    	System.out.println("�����ɼ�        "+math[index]);
			    	System.out.println("JAVA�ɼ�    "+java[index]);

			    	System.out.println("Ӣ��ɼ�         "+English[index]);
			    }
		}

}
