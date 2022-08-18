package demo;

public class Datatype_Demo
{
	// Datatype
	// used to represent the type of information.
	// Two types of datatype
	// 1. Primitive datatype   --> 
	 // 8 datatype
	// int, float, double, boolean, long , short, char, byte
	public static void main (String[] args)
	{
		Datatype_Demo d = new Datatype_Demo();
		d.integer();
		d.Boolean();
		d.Byte();
		d.Short();
		float f = 1.0000005f;
		System.out.println(f);
		
		double t = 1234567891.00000000456789;
		System.out.println(t);
	}
	public void integer ()
	{
		int i = 1234567891;  // -2^31 to ((2^31)-1) 
		System.out.println(i);
	}
	public void Byte ()
	{
		byte i = -128;  // -128 to 127 
		System.out.println(i);
	}
	public void Short ()
	{
		short i = -32768;  // -32768 to 32767 
		System.out.println(i);
	}
	public void Boolean ()
	{
		boolean i = true;  // true or false 
		System.out.println(i);
	}
	
	
	
	
	
	
	
	
	
	// 2. Non-primitive datatype

}
