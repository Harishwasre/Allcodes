package method_Calling;

public class Test_class_constructor
{
	public static void main(String[] args)
	{
		// Static Method 
		Test_class.Addition(5); //-->0
		
		Test_class t = new Test_class(8); // Parameterized Constructor
		t.Substraction('f', 0, null);  //--> -10
		Test_class.Addition(8); // -->30
		
		System.out.println("-------------");
		
		Test_class r = new Test_class();   // Non-Parameterized Constructor
		r.Substraction('f', 0, null);  //--> 1
		Test_class.Addition(8); // -->9	
	}
}
