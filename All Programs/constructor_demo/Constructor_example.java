package constructor_demo;

public class Constructor_example
{ // special member
	// also act as instance
	// used to initialized the datamember (variables), static, nonstatic
	
	// steps
	/* 1. constructor name should be same as that of the class name
	 * 2. Constructor has no return type --> void, int, float, String etc.
	 * 3. You can provide access modifier --> public, private, protected, default
	 * 4. Any number of constracto we can declare in class
	 * 
	 * Standard programming
	 * 1. Declaration---> int a; / String b;
	 * 2. Initialization --> Constructor creation -->a =10; / b ="ASPIRE"; --> constructor close
	 * 3. Usage  --> main method
	 * 
	 */
	//Declaration
	static int a;
	static String b;
	//Initialization
	public Constructor_example ()
	{
		a=10;
		b = "ASPIRE";
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}
	public static void main(String[] args)
	{
		
		// usage
		new Constructor_example ();
		System.out.println(a);
		System.out.println(b);	
	}
}
