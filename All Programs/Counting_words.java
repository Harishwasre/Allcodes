package com.infy.string_Test;

public class Counting_words
{
	public static void main(String[] args) {
		String s = "ASPIRE ASPIRE ASPIRE ASPIRE";
		int count=0;
		for (int i=0; i<s.length(); i++)
		{
			if (s.charAt(i)== 'I')
			{
				count++;  //1 + 1
				System.out.println(count);
			}
		}
		System.out.println("Count of I="+ count);
	}

}
