package com.infy.string_Test;

public class Swapping_String 
{
	public static void main(String[] args) {
		String s1 = "ASPIRE";
		String s2 = "TEAM";
		String store;
		
		// S1--> TEAM
		// S2 --> ASPIRE
		
		store = s1; // store-->s1-->ASPIRE
		s1 = s2;	// s1-->s2-->TEAM
		s2 = store;    // s2-->s1-->TEAM
		
		System.out.println("I am s1=" + s1);
		System.out.println("I am s2="+ s2);
		
		
		
	}

}
