package com.deadpool.dome;

import java.util.ArrayList;

public class Database {

	private ArrayList<Item> listItem =  new ArrayList<Item>();
	
	

	public void add(Item item)
	{
		listItem.add(item);
	}
	
	public void list()
	{
		for( Item item : listItem )
			item.print();
	}
	
	
	public static void main(String[] args) {
		Database db = new Database();
		db.add(new CD("abc","fasd",4,60,"wqe"));
		db.add(new CD("absdc","fadfsd",4,60,"wqe"));
		db.add(new DVD("absdc","fadfsd",60,"wqe"));
		db.list();
	}

}
