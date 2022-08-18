package casting_Conversion;

public class Primitive_Casting 
{
	// we are converting type of information into another datatype
	/*
	 * 1. Implicite Casting / Widening conversion
	 * 2. Explicite Casting / narrowing Conversion
	 * 3. Boolean Casting --> java does not support B. casting hence it is consider as incompatible type of casting
	 */

	// Implicit Casting
	// Lower datatype info --> Higher datatype info
	// We dont need to force to convert lower to higher datatype
	// byte (1b)-->short(2b)-->int(4b)--> long(8b)
	// float(4b)-->double(8b)
	
	public void implicit_casting () // No data loss
	{
		int a =123456789;
		long l = a;
		float f = a;
		double d = a;
		System.out.println(a+" "+l+" "+f+" "+d);
		//short s = a;
		//byte b = a;
	}
	
	public void explicit_casting ()// Datat loss is present
	{
		// Higher datatype info --> Lower datatype info.
		// long -->int-->short-->byte
		// double-->float
		
		int a = 50;					// Superclass s = new SubClass (); 
		short s = (short) a;		// SubClass sub = (SubClass) s;
		byte b = (byte) a;
		System.out.println(a+" "+s+" "+b);
		
	}

	public static void main(String[] args)
	{
		Primitive_Casting p = new Primitive_Casting();
		p.implicit_casting();
		p.explicit_casting();
	}
}
