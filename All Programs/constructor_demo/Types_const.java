package constructor_demo;

public class Types_const
{
	/*
	 *  two types
	 *  1. Default constructor
	 *  2. Parameterized Constructor / User-defined Constructor
	 *  	1. Zero argument Constructor / Non argument constructor
	 *  	2. Argument constructor / parameterized constructor
	 */
	// Declaration
	int a;
	String b;
	// initialize
	public Types_const () // Zero argument
	{
		a = 10;
		b = "Aspire";
		int c = 5;    // local
		System.out.println("Addition="+ (a+c));
		System.out.println(b);
	}
	public Types_const (int w)  // Parameterized Constructor
	{
		a = 20;
		b = "Team";
		int c = 15;
		System.out.println("Addition="+ (a+c));
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		new Types_const ();  //Zero Argument
		new Types_const (1); // Parameterized Constructor
	}
}