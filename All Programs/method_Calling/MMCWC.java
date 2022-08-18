package method_Calling;

public class MMCWC
{
	/*
	 * 1. Making the method call within the class -->MMCWC
	 * 2. Making a method call from different class --> MMCDC
	 * 3. Making a method call with argument within the class --> MMCWAWC
	 * 4. Making method call with argument in different class.
	 */
	static int a= 10;
	static int b = 20;
	//Static Method
	public static void Addition ()
	{
		int c = a+b;  //Local Variable
		System.out.println("Addition="+c);
	}
	
	// Non static method
	private void Substraction ()
	{
		int c = a-b;   //Local Variable
		System.out.println("Substraction="+c);
	}
	
	protected void multiplication ()
	{
		int c = a*b;   //Local Variable
		System.out.println("multiplication="+c);
	}
	
	public static void main(String[] args)
	{// static
		Addition ();
		
		// Non static 
		// classname orf = new classname()
		// classname orf = constructor;
		MMCWC m = new MMCWC();
		m.Substraction();
		
	}
	
	

}
