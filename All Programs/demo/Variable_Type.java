package demo;

public class Variable_Type
{
	// 1. Local Variable
	// local v is non static
	// we can use that local variable inside the method where it is created.
	// we are not able to call the local variable inside the main method.
	// We need to initialize the local variable
	
	
	public void demo ()
	{
		// Local variable
		int a = 123456;   //Initialinzing 
		double d ;        // Not initialize
		System.out.println(a);
		// System.out.println(d);
		
	}
	
	public static void main (String [] args)
	{
		Variable_Type v = new Variable_Type();
		v.demo();
		//System.out.println(a);
	}

}
