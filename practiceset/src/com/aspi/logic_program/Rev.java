package com.aspi.logic_program;

public class Rev {

	public static void main(String[] args)
	{
		String ha="iam harish";
		String[] har = ha.split(" ");
		
		String revword="";
		for( String a:har) 
		{
			String rev = "";
			for(int i=a.length()-1;i>=0;i--) 
			{
			 rev= rev+ a.charAt(i);
		    }
			revword=revword+rev+" ";
		}
		System.out.println(revword);
	}
	
}

