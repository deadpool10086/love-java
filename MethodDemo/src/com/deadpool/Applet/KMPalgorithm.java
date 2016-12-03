package com.deadpool.Applet;

import java.util.Scanner;

public class KMPalgorithm {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入子字符串");
			String data;
			data = scanner.next();
			KMPString aKmpString = new KMPString(data);
			System.out.println("请输入主串");
			data = scanner.next();
			int anwser;
			anwser = aKmpString.compare(data);
			if (0 < anwser)
				System.out.println(anwser);
			else
			{
				System.out.println("查无此串");
			}
	}
	
}

class KMPString {
	private String tollString_;
	private int next_[];
	private int maxSize_;
	
	public KMPString (String tollString) 
	{
		tollString_ = tollString;
		int i = 1;
		maxSize_ = tollString.length();
		next_ = new int[maxSize_];
		next_[0] = -1;
		int j = 0; 
		
		
		//i 代表当匹配的位置， j代表已经匹配的个数
		while(i < maxSize_)
		{
			if (j == 0 || tollString_.charAt(i) == tollString_.charAt(j)){ 
				i++;
				j++;
				next_[i] = j;       //如果已经匹配到了j个这次如果匹配失败直接跳到第j个继续匹配

			}
			else {
				j = next_[j];
			} 
		}
		return;
	}
	public void correctionKMPString (String tollString) 
	{
		tollString_ = tollString;
		int i = 1;
		maxSize_ = tollString.length();
		next_ = new int[maxSize_];
		next_[0] = -1;
		int j = 0; 
		
		
		//i 代表当匹配的位置， j代表已经匹配的个数
		while(i < maxSize_)
		{
			if (j == 0 || tollString_.charAt(i) == tollString_.charAt(j))
			{
				i++;
				j++;
				if(tollString_.charAt(i) != tollString_.charAt(j))
				{
					next_[i] = j;
				}
				else
				{
					next_[i] = next_[j];
				}
			}
			else {
				j = next_[j];
			} 
		}
		return;
	}
	public int compare(String data){
		int i = 0;
		int j = 0;
		while(i < data.length() && j <maxSize_ )
		{
			if (j == -1 ||data.charAt(i) == tollString_.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				j = next_[j];
			}
		}
		
		if (j == maxSize_)
			return i-maxSize_;
		else {
			return -1;
		}
	}
}
