package com.infy.Array;

public class Multi_D_Array_Not_Fixed
{
	/*
	 * 1D --> int[] a = {};
	 * 2D --> int[][] a = { {} };
	 */
	public static void main(String[] args)
	{
		Array();
	}


	public static void Array()
	{
		int[][] a = {{1,2,3,4,55}, {5,6,7,8,56,58,59}, {9,10,11,12}}; 

		for (int i=0; i<3; i++) // Row
		{
			for (int j=0; j< a[i].length; j++) // Column 
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	
	public void Fixed_Array()
	{
		int[][] a = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}}; //3 X 4 column


		for (int i=0; i<3; i++) // Row
		{
			for (int j=0; j<4; j++) // Column 
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
