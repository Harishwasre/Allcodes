package scanner_practice;

import java.util.Scanner;

//import java.util.Scanner;

public class Scanner_Demo {
	
	static int a; // static variable
	
	public static void main(String[] args)
	{
		// we used it to take the input from user
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of a=");
		a = sc.nextInt();
		demo ();
		sc.close();
	}
	public static void demo ()
	{
		if (a <5)
		{
			System.out.println("A is less than 5");
		}else
		{
			System.out.println("A is greater than 5");
		}
	}
}
