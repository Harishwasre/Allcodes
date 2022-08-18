package demo;

public class Static_Variable 
{

	// Static variable declared under the class body and not in the method body
	// we can call static variable in any method
	// no need to initialize the static variable --> default value 
	
	
	
	static int a = 123;   //initialize
	static double d;		// non initialized
	
	public static void Demo1 ()
	{
		System.out.println("I am in Demo1  " + a);
		System.out.println("I am non initialzed data in Demo1  " + d);
	}
	
	public void Demo2 ()
	{
		System.out.println("I am in NOn static method   " + a );
		System.out.println("I am non initialzed data in non static method  "+d);
	}
	
	
	public static void main(String[] args)
	{
		Demo1 ();
		Static_Variable s = new Static_Variable();
		s.Demo2();
		System.out.println(s.a);
		System.out.println(a);

	}

}
