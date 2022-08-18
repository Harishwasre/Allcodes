package method_Calling;

public class Test_class
{
	static int a;
	static int b;
	
	public Test_class (int y)
	{
		a=10;
		b=20;
	}
	public Test_class ()
	{
		a=5;
		b=4;
	}
	public static void Addition (int q)
	{
		int c = a+b;  //Local Variable
		System.out.println("Addition="+c);
	}
	public void Substraction (char w, int t, String u)
	{
		int c = a-b;   //Local Variable
		System.out.println("Substraction="+c);
	}
}
