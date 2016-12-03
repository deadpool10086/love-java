package com.deadpool.pol;

interface USB{
	void start();
	void stop();
}

class C{
	public static void work(USB u)
	{
		u.start();
		System.out.println("工作中");
		u.stop();
	}
}

class USBDist implements USB
{
	public void start(){
		System.out.println("U盘启动了");
	}
	
	public void stop(){
		System.out.println("U盘停止了");
	}
}

class Printer implements USB{
	public void start()
	{
		System.out.println("打印机开始工作");
	}
	public void stop() {
		System.out.println("打印机停止工作");
	}
}

public class InterDemo01 {

	public static void main(String[] args) {
		C.work(new USBDist());
		C.work(new Printer());

	}

}
