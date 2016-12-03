package com.deadpool.Applet;

class tests{
	public int i;
	tests(int j){
		i = j;
	}
}

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		tests a = new tests(1);
		tests b = new tests(2);
		b = a;
		a.i = 100;
		System.out.println(a.i+" "+b.i);
	}

}
