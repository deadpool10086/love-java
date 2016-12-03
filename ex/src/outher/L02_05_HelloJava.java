package outher;

import java.util.Scanner;

public class L02_05_HelloJava {

	public static void main(String[] args) {
	      int m;
	      int n;
	      int a;
	      Scanner s = new Scanner(System.in);
	      System.out.println("输入一个整数：");
	      m=s.nextInt();
	      System.out.println("输入另一个整数：");
	      n=s.nextInt();
	      a=(m<n?m:n);
	      for(int i=a;i>1;i--){
	    	  if(n%i==0&&m%i==0){
	    		  System.out.println("最大公约数为："+i);break;
	    	  }
	      }
	      s.close();
	}    
}
