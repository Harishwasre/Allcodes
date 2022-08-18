package com.aspi.logic_program;

public class Concat {

	public static void main(String[] args)
	{
//		String s1="harish";
//		String s2="subhash";
//		String s3="wasre";
//		String s4=s1.concat(s2).concat(s3);
//		System.out.println(s4);
//		System.out.println(s1+s2+s3);
//		String s1="harish,subhash,wasre";
//		String[] s2=s1.split(",");
//		for(int i=0;i<=s1.length()-1;i++) 
//		{
//			char s3=s1.charAt(i);
//		
//			
//		}	
//		String s4 = s1.replace(",", "");
//		System.out.print(s4);
//		String s1="harish washre";
//		String s2 = s1.replace(" ", "");
//		System.out.println(s2);
		
//		String s1="harish washre";
//		String[] s4=s1.split(" ");
//		for(int i=0;i<=s4.length-1;i++) 
//		{
//			System.out.print(s4[i]);
//		}
		String s=new String("harish");
		String s1="harish subhas wasre";
		String s2="harish";
		System.out.println(s==s1);
		System.out.println(s1.subSequence(1, 3));
		System.out.println("   ------"+s1.substring(0,5));

	}

}
