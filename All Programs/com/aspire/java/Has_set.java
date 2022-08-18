package com.aspire.java;

import java.util.Collections;
import java.util.HashSet;

public class Has_set 
{
	public static void main(String[] args) 
	{
		HashSet h = new HashSet ();
		h.add('a');
		h.add('b');
		h.add('c');
		h.add('d');
		h.add('e');
		
		System.out.println(h);	
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println(h.contains('a'));
		h.remove('c');
		System.out.println(h);
		System.out.println();
		HashSet hs = new HashSet ();
		hs.addAll(h);
		System.out.println(hs);
		hs.removeAll(hs);
		System.out.println(hs);
		//Collections.sort(h);
		//System.out.println(h);
	//	1 2 6 3 4 5
		
	}

}
