package non_Primitive_casting;

public class Downcasting
{
	// downcasting --> prop (Superclass + subclass) --> test class --> This is nothing inheritance
	// Hence it is not advisable to use downcasting in java

	// Syntax
	/*
	 * 1. before performing DC we need to perform UC
	 * 
	 * Superclass s = new Subclass ();
	 * Subclass sub = (Subclass) s;
	 */
	public static void main(String[] args)
	{
		// Up-casting
		Superclass d=new Subclass();  //--> object of subclass, refer-->superclass
		// Down casting
		Subclass sub = (Subclass) d;
		
		sub.house(); // Override
		sub.car(); 	// Override
		sub.land(); // Superclass
		sub.job(); // Subclass
		
		System.out.println("------------------------");
		Subclass su = new Subclass();
		su.house(); // Override
		su.car(); 	// Override
		su.land(); // Superclass
		su.job(); // Subclass

	}
}
