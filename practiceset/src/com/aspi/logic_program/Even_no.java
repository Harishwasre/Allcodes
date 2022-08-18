package com.aspi.logic_program;

public class Even_no
{
	public static void main(String [] args)
	{
		int []a= {1,2,3,4,5,6,7,8,9,10};
//		for (int j=0;j<=10;j++)
//		{
//	      System.out.println(j);
//			
//		} 

		for (int j=0;j<=a.length-1;j++)
		{
		if(a[j]%2==0)
		   {
			 
			System.out.print("even no "+a[j]+" ");
			System.out.println();
			
		   }
		else {
			   System.out.print("odd no "+a[j]+" ");
		   }
		} 
	}

}
