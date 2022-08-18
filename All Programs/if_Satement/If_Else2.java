package if_Satement;

public class If_Else2
{
	int a = 10;		//Instance Variable 
	public void Demo ()
	{
		int b = 20;  // Local variable
		if (a>b)
		{
			System.out.println("a is greater than b");
		}
		else 
		{
			System.out.println("a is less than b");
		}
	}
	public static void main(String[] args)
	{
		If_Else2 i = new If_Else2();
		i.Demo();
		
	}

}
