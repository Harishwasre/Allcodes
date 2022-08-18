package com.aspi.logic_program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Unique_no {

	public static void main(String[] args) {
		int a[]= {10,20,15,85,65,45,71,10,20,45};
//		Arrays.sort(a);
//		int b=a.length;
//		HashMap<Integer, Integer>hashmap=new HashMap<Integer,Integer>();
//		
//		
//		for(int i=0;i<=b-1;i++) 
//		{
//			hashmap.put(a[i],i);
//		}
//		System.out.print(hashmap.keySet());
		HashSet<Integer>set=new HashSet<Integer>();
		for (int x : a) {
			set.add(x);
		}
		for (Integer x : set) {
			
			System.out.println(x+" ");
		}

	}

}
