package nested_For_demo;

public class Inverted_T {

	public static void main(String[] args)
	{
		int row = 5;
		for (int i=1; i<=row; i++)
		{
			for (int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
