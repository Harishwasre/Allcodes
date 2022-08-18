package com.infy.string_Test;

public class Reverse_String {

	public static void main(String[] args)
	{
		String s = "TEAM ASPIRE";
		// reverse -->MAET ERIPSA
		
		char[] q = s.toCharArray();
		for (int i=s.length()-1; i>=0; i--)
		{
			System.out.print(q[i]);
		}
		
		
		System.out.println("");
		System.out.println(s.length());
		for (int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
