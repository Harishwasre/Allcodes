package com.aspi.logic_program;

import java.util.Arrays;

public class Sot
{
	public static void main(String[] args) {
		int[] a= {10,20,4,1};
	int ab=	a.length;
		 Arrays.sort(a);
		for(int i=0; i<ab;i++)
			
		{
			System.out.println(a[i]);
			
		}
		System.out.println("------------------");
        for(int i=a.length-1; i>=0;i--)
			
		{
			System.out.println(a[i]);
		}
	}

}
