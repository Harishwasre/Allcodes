package polymorphism;

public class Complie_Time_P
{
	// Early Binding / Static Binding / method overloading
	// Method --> we can call using its signature / argument
	
	// Rules
	/*
	 *  1. Multiple methods-->Same methodname with different argument-->within the same class
	 *  2. Static as well as non static method
	 *  3. Return type cant be change
	 *  4. we can overload the main method
	 */

	public void Addition ()
	{
		System.out.println("Addition is 0 argument");
	}
	// Number of Arguments
	public void Addition (int a)
	{
		System.out.println("Addition is int");
	}
	public void Addition (int a, int b)
	{
		System.out.println("Addition is int + int");
	}
	// By changing the datatypes
	public void Addition (char a)
	{
		System.out.println("Addition is char");
	}
	public void Addition (String w)
	{
		System.out.println("Addition is String");
	}
	public static void Addition (int a, char b)
	{
		System.out.println("Addition is int + char");
	}
	public static void main() 
	{
		System.out.println("'main method'");	
	}
}
