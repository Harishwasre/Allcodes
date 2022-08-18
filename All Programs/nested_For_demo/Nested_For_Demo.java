package nested_For_demo;

public class Nested_For_Demo {
	
	protected  void demo2 ()
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

	public void demo ()
	{
		int a = 5;
		for (int i=1; i <= a; i++)  // Row
		{
			System.out.println("Row:"+ i);

			for (int j=1; j<=i; j++) // Column
			{
				System.out.print("Column:"+j);
			}
			System.out.println("");
		}
	}
	public static void main(String[] args)
	{
		Nested_For_Demo n = new Nested_For_Demo();
		n.demo();
	}

}
