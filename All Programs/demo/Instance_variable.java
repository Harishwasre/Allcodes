package demo;

public class Instance_variable
{
	// Creating it under the class body
	// we are not using static keyword.
	// we can not call nonstatic variable inside the static method
	// We can use nonstatic variable only inside the nonstatic methods
	// We can create and call non initialized variable inside the nonstatic method only
	
	
	int a = 123;
	double d ;
	
	/*public static void Demo1 ()
	{
		System.out.println("I am in Demo1  " + a);
		System.out.println("I am non initialzed data in Demo1  " + d);
	}*/
	
	public void Demo2 ()
	{
		System.out.println("I am in NOn static method   " + a );
		System.out.println("I am non initialzed data in non static method  "+d);
	}
	
	
	public static void main(String[] args)
	{
		// Demo1 ();
		Instance_variable s = new Instance_variable();
		s.Demo2();
		System.out.println(s.a);
		
		// System.out.println(a);

	}

}
