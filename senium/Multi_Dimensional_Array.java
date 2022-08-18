package com.infy.Array;

public class Multi_Dimensional_Array
{
	// Two-Dimensional arrays
	/*
	 *  Declaration--> 1D--> 	datatype variable [] = new datatype [info]; -->a[0] = info;
	 *  			--> 2D--> 	datatype[][] variable = new datatype [row info][column info]; 
	 */
	
	public static void main(String[] args)
	{
		int[][] a = new int [2][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]= 30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;
		
//		System.out.println(a[0][0]);
//		System.out.println(a[1][1]);
		
		for (int i=0; i<2; i++) // Row
		{
			for (int j=0; j<3; j++) // Column 
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
