package non_Primitive_casting;

public class Test {

	public static void main(String[] args)
	{
		Subclass s =new Subclass();
		s.car();
		s.house();
		s.job();
		s.land();
		
		// Upcasting
		/*
		 *  call to --> 1. overrided methods 
		 *  			2. Methods belongs to superclass only
		 */
		System.out.println("-------------------");
		Superclass d=new Subclass();
		d.car();   // overrided --> get the method from subclass
		d.house(); // overrided --> get the method from subclass
		// d.job();   // Method belong to subclass
		d.land();  // Method belong to superclass
		
	}

}
