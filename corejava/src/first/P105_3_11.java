package Homework;

public class P105_3_11 {

	public static void main(String[] args) {
		System.out.println("***本程序输出结果如下***");
		char ch1[]=new char[20];
	    String str="";
	    StringBuffer strbuf=new StringBuffer("abcdABCD 中华人民共和国");
	    str=strbuf.toString();
	    str=str+"";
	    ch1=str.toCharArray();
	    System.out.println(ch1);
	    
	    System.out.println();
	    strbuf=strbuf.insert(0,"EF");
	    strbuf=strbuf.insert(6,"ef");
	    strbuf=strbuf.insert(8,4321);
	    System.out.println(strbuf);
	   
	    System.out.println();
	    strbuf=strbuf.delete(12, 24);
	    System.out.println(strbuf);
	    
	    System.out.println();
	    System.out.println("最终输出结果：");
	    strbuf=strbuf.insert(0,"全世界华夏儿女    ABCD");
	    System.out.println(strbuf);
	
	
	
	
	
	
	
	
	
		

	}

}
