package display;

public class Display {

	private int value = 0;
	private int limit = 0;
	
	
	public Display(int limit)
	{
		this.limit = limit;
	}
	public void increase()
	{
		value++;
		if (value == limit)
		{
			value = 0;
		}
	}
	
	public int getValue()
	{
		return value;
	}
	
	public static void main(String[] args) {
		Display d1 = new Display(10);
		Display d2 = new Display(20);
		d1.increase();
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		
	}

}
