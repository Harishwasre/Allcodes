//package com.infy.string_Test;

public class Demo_test {

	public static void main(String[] args)
	{
		String s1 = "ASPIRE";
		String empty ="";
		String s2 = new String ("aspire");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.indexOf('I')); // I -->3
		System.out.println(s1.charAt(2)); //2 -->P
		System.out.println(s1.lastIndexOf('E')); //-->13
		System.out.println(s1.equals(s2)); // False
		System.out.println(s1.equalsIgnoreCase(s2));  //true
		System.out.println(s1.contains(s2));
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());
		System.out.println(empty.isEmpty());
		System.out.println(s1.length());
		
	}

}
