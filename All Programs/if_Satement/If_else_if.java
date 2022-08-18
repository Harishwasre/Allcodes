package if_Satement;

public class If_else_if
{
	int a = 10;			// Instance
	static int b = 10;	// Static
	
	public void demo ()	// Non static
	{
		int c = 10;	// Local
		
		if (a==b)
		{
			System.out.println("a is equal to b");			
		} else if (b < c)
		{
			System.out.println("b is equal to c");
		} else if (c > a)
		{
			System.out.println("c is equal to a");
		} else 
		{
			System.out.println("a,b,c are not same");
		}
	}
	public static void main(String[] args)
	{
		If_else_if i = new If_else_if();
				i.demo();	
	}

}
