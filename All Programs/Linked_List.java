package com.infy.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List
{
	public static void main(String[] args)
	{
		LinkedList a = new LinkedList();
		
		a.add("ASPIRE");
		a.add(100);
		a.add('A');
		a.add(60.5f);
		a.add(100);
		a.add(null);
		a.add(null);
		a.add(null);
		
		System.out.println(a);
		System.out.println(a.size()); //8
		
		System.out.println(a.isEmpty()); // false
		System.out.println(a.contains("ASPIRE")); //true
		System.out.println(a.contains("AspIre")); // false
		
		a.add(3, "TEAM");
		System.out.println(a);  // Shifting of index only and not the information
		
		a.remove(3);
		System.out.println(a);  
		
		System.out.println(a.get(3));

		System.out.println("------ Iterator------");
		Iterator itr = a.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("------List Iterator------");
		ListIterator list = a.listIterator();
		while (list.hasNext())
		{
			System.out.println(list.next());
		}
		System.out.println("------Simple For Loop----------");
		for (int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("------For Each Loop----");
		for (Object w:a)
		{
			System.out.println(w);
		}
	}

}
