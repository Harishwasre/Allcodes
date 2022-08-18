package com.java_selenium;

public class Demo12 {

	public static void main(String[] args)
	{
		String s="my name is harish";
		String[] a = s.split(" ");
		String santance="";
		
		for(String w:a)
		{
			String word="";
			for(int i=w.length()-1;i>=0;i--) 
				
			{
				word=word+w.charAt(i);
			System.out.println(word);
			}santance=santance+word+" ";
		}System.out.println(santance);
	}
	
}
