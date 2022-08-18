package polymorphism;

public class Run_Time_Superclass
{
	// Dynamic Binding/ late binding/ method Overriding
	
	// rules
	/*
	 * 1. Methods must have the same name in superclass & subclass
	 * 2. Method signature must be same in both the class
	 * 3. We must have to perform inheritance
	 * 4. Only nonstatic methods are overriden
	 */

	
	
	/* Superclass --> Addition (int a){}
	 * Subclass -->   Addition (int b){}
	 */
	
	public void property (int a) // Non Static
	{
		System.out.println("This property is belongs to father");
	}
	
	public static void House (String s) // Static
	{
		System.out.println("This hous is belong to father");
	}
	
	
	
	
	
}
