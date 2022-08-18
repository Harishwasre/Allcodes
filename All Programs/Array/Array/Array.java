package com.infy.Array;

public class Array
{
	/*
	 *  int a = 1;
	 *  int b = 2;
	 *  int c = 3;
	 *  .
	 *  .
	 *  .
	 *  .
	 *  .
	 *  .
	 *  int a100 = 100;
	 *  
	 *  Solution for this is array.
	 *  // for array --> Same
	 *  // With the help of object class --> we can store multiple type of info.
	 *  
	 *  Array is a collection of similar type of data. 
	 *  It is fixed in size
	 *  It is a collection of homogeneous data elements. - eg. all integers
	 *  It stores the value on the basis of the index value.
	 */


	// Syntax
	// datatype variable [] = new datatype [no. of info we need to store]; 
	// int a [] = new int [5];

	public static void main(String[] args)
	{
		int a [] = new int [5];  // Fixed array
		a [0] = 10;
		a[1]= 20;
		a[2]= 30;
		a[3] = 40;
		a[4] = 100;
		
		System.out.println("Length of array= "+ a.length); // To find the length of array
		
		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);
//		System.out.println(a[4]);
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		// For each loop
		// 1. Initialization	
		System.out.println("--------------------------");
		System.out.println("For each loop");
		
		for (int r : a)
		{
			System.out.println(r);
		}

	}
}
