package animal;



import java.util.ArrayList;

import location.Location;

public abstract class Animal {
	private  int age;
	private  int maxAge;
	private  boolean isAlive = true;
	private  int breedableAge;
	
	
	
	public Animal(int maxAge, int breedableAge) {
		super();
		this.maxAge = maxAge;
		this.breedableAge = breedableAge;
		this.age = 0;
	}
	
	protected int  getAge() {
		return age;
	}
	
	protected double getAgePercent() {
		double ret = (double)age/maxAge;
//		if(ret > 1)
//		{
//			System.out.println(age);
//			System.out.println(maxAge);
//			System.exit(0);
//		}
		return ret;
		
	}
	public boolean isAlive() {
		return isAlive;
	}
	
	public boolean isBreedable()
	{
		return age >= breedableAge;
	}

	public void grow()
	{
		age++;
		if (age >= maxAge)
		{
			if(age - maxAge >= 2)
			System.out.println(age+" "+maxAge);
			die();
		}
	}
	
	public void die()
	{
		isAlive = false;
	}
	public Location move(Location[] freeAdj)
	{
		Location ret = null;
		if (freeAdj.length>0 && Math.random() < 0.02)
		{
			ret = freeAdj[(int)(Math.random()*freeAdj.length)];
		}
		return ret;
	}
	
	public abstract Animal breed();
	public Animal feed(ArrayList<Animal> neighbour)
	{
		return null;
	}
	void longerLife(int length)
	{
		maxAge+=length;
	}
}
