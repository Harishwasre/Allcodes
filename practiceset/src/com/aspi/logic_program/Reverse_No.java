   package com.aspi.logic_program;

public class Reverse_No
{
	public void rev_no() 
	{
		int num=123456;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);	
	}
    public static void main(String[]args) 
    {
    	 Reverse_No a=new  Reverse_No();
    	 a.rev_no();
    }
}
