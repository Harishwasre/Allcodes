package if_Satement;

public class Simple_if2
{
	static int a = 10;			// static variable
	static boolean b = true;	// static variable

	public static void Simple ()
	{
		System.out.println("----I am in Simple method-----");  // Confirmed
		if (a == 10) // a=10
		{
			System.out.println("I am 10"); // Expected
		}
		if (b = true)
		{
			System.out.println("I am true");  //expected
		}
		System.out.println("---------------");    //Confirmed
	}
	
	public static void Simple2()
	{
		System.out.println("----I am in Simple2 method-----");  // Confirmed
		if (b = false)  // b=true
		{
			System.out.println("I am false");  // Expected
		}
	}
	public static void main(String[] args)
	{
		Simple();  // Static method
		Simple2();	// Static method
	}

}
