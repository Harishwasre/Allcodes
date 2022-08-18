package com.aspi.logic_program;

import java.util.Arrays;

public class Array_max_no 
{
	   public static void main(String args[]){
		      int array[] = {10, 20, 25, 63, 96, 57};
		    int size=array.length;
		    Arrays.sort(array);
		    Arrays.toString(array);
		   int max= array[size-2];
		   int max2=array[size-3];
		     System.out.println(max+" "+max2);
		   }

}
