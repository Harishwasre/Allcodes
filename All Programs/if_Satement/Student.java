package if_Satement;

public class Student
{ 
	int a = 10;
	static int b= 20;
	public void Demo ()
	{
		int c = 30;
		if (a==b)
		{
			System.out.println(" a is equal to b");
		}
		else if (b==c)
		{
			System.out.println(" B i sequal to C");
		}
		else if (c==a)
		{
			System.out.println(" C is equal to a");
		}
		else
		{
			System.out.println(" a,b, c are not same");
		}
	}
	public static void  main (String [] args)
	{
		Student d = new Student ();
		d.Demo();
	}
}



