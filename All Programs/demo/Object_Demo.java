package demo;

public class Object_Demo 
{
	public static void static_object ()
	{
		System.out.println("I am from Static method");
	}
	
	public void nonStatic_object ()
	{
		System.out.println("I am from non static method");
	}

	public static void main (String[] args)
	{
		static_object();  // static way to call the method
		
		Object_Demo d = new Object_Demo();  // Non static way to call the method
		d.nonStatic_object();
		d.static_object();
	}
}
