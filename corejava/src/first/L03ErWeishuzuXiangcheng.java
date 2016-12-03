package first;
import java.util.Scanner;

public class L03ErWeishuzuXiangcheng {
	public static void main(String[] args) {
        int i,j;
        int H,L;
        int number;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("��������󲻳������ֵ��\n");
        number=sc.nextInt();
        System.out.print("���������������\n");
        H=sc.nextInt();
        System.out.print("���������������\n");
        L=sc.nextInt();
        int x[][]=new int[H][L];
        int y[][]=new int[H][L];
        int c[][]=new int[H][L];
        System.out.println();
        System.out.println("��һ����ά�����ǣ�");
        for(i=0;i<H;i++){
        	for(j=0;j<L;j++){
        		x[i][j]=(int)(Math.random()*number);
        		System.out.print(x[i][j]+"\t");
        	}
        	System.out.println();
        }
        
        System.out.println();
        System.out.println("�ڶ�����ά�����ǣ�");
        for(i=0;i<H;i++){
        	for(j=0;j<L;j++){
        		y[i][j]=(int)(Math.random()*number);
        		System.out.print(y[i][j]+"\t");   
        	}
        	System.out.println();
        }
       
    	System.out.println();  
 		System.out.println("������ά������˺�õ����������£�");
        for(i=0;i<H;i++){
        	for(j=0;j<L;j++){
               c[i][j]=x[i][j]*y[i][j];
        		System.out.print(c[i][j]+"\t");
        	}
        	System.out.println();
        }   
	}
}
