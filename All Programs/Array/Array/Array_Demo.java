package com.infy.Array;

public class Array_Demo
{
// if array is not fixed
	public static void main(String[] args)
	{
		String[] a = {"Aspire", "Team", "Java", "Manual", "Selenium", "Unix", "DB"};
		
		//System.out.println(a[3]);
		
		for (String q : a)
		{
			System.out.println(q);
		}
		
		// use Simple for loop to print the String datatype
		
		System.out.println("-----------------");
		Object o [] = new Object [3];
		o[0]=12;
		o[1]="Aspire";
		o[2]=20.5;
		
		System.out.println(o[0]);
		System.out.println(o[1]);
		System.out.println(o[2]);
		
	}
}
