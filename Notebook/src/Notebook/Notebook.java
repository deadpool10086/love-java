package Notebook;

import java.util.ArrayList;
import java.util.HashSet;

class Value{
	private int i;
	public void set(int i)
	{
		this.i=i;
	}
	public int get()
	{
		return i;
	}
}


public class Notebook {

	private ArrayList<String> notes = new ArrayList<String>();
	
	public void add(String s)
	{
		notes.add(s);
	}
	public void add(String s, int location)
	{
		notes.add(location,s);
	}
	public int getSize()
	{
		return notes.size();
	}
	
	public String getNote(int index)
	{
		return notes.get(index);
	}
	
	public void removeNote(int index)
	{
		notes.remove(index);
	}
	
	public String[] list()
	{
		String[] a = new String[notes.size()];
//		for (int i=0; i < notes.size(); i++)
//			a[i] = notes.get(i);
		notes.toArray(a);
		return a;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> a =new ArrayList<String>();
		a.add("fist");
		a.add("second");
		a.add("first");
		for (String s : a)
		{
			System.out.println(s);
		}
		System.out.println("-------------------------");
		HashSet<String> s = new HashSet<String>();
		s.add("first");
		s.add("second");
		s.add("first");
		
		System.err.println(s);
//		Value[] a = new Value[10];
//		for (int i=0; i<a.length; i++)
//		{
//			a[i] = new Value();
//			a[i].set(i);
//		}
//		for( Value v: a)
//		{
//			v.set(0);
//		}
//		for( Value v: a)
//		{
//			System.out.println(v.get());
//		}
		
//		int[] ia = new int[10];
//		String[] a = new String[10];
//		for(int i=0; i<a.length; i++)
//		{
//			a[i] = ""+i;
//		}
//		System.out.println(ia[0]);
//		System.out.println(a[0].length());
//		
//		Notebook nb = new Notebook();
//		nb.add("first");
//		nb.add("second");
//		nb.add("third",1);
//		System.out.println(nb.getSize());
//		System.out.println(nb.getNote(0));
//		String[] a = nb.list();
//		for (String s:a)
//		{
//			System.out.println(s);
//		}
	}

}
