package clock;

import display.Display;

public class Clock {

	private Display hour = new Display(24);
	private Display minute = new Display(60);
	private Display second = new Display(60);
	
	
	public Clock(int hour, int minute, int second)
	{
		for(int i=0; i<hour; i++ )
			this.hour.increase();
		for(int i=0; i<minute; i++)
			this.minute.increase();
		for(int i=0; i<second; i++ )
			this.second.increase();
			
	}
	
	public void tick()
	{
		second.increase();
		if(second.getValue()==0)
		{
			minute.increase();
			if(minute.getValue() == 0)
				hour.increase();
		}
	}
	public String toString()
	{
		String a = String.format("%02d:%02d:%02d",hour.getValue(),minute.getValue(),second.getValue());
		return a;
	}
	public void start()
	{
		while(true)
		{
			minute.increase();
			if (minute.getValue() == 0){
				hour.increase();
			}
			System.out.printf("%02d:%02d\n",hour.getValue(),minute.getValue());
	
		}
	}
	
	
	
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in); 
		Clock clock = new Clock(in.nextInt(),in.nextInt(),in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
				
	}

}
