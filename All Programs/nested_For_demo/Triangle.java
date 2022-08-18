package nested_For_demo;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the user input:");
		int row = sc.nextInt();
		for (int i=1; i<=row; i++)
		{
			//System.out.println();
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}
}
