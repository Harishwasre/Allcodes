package demo;

public class New_Demo 
{
	public static void main (String[] args) 
	{
		// static Method calling
		//methodNamewithmethodSignatureendedbysemicolon	
		// New();
		// Aspire();
		
		// Non static method calling
		// className objectreferencevariable = new constructor ();
		
		New_Demo ASPIRE = new New_Demo();
		ASPIRE.Substraction();
		ASPIRE.Aspire();
		
		// object is an entity which has its own state and behaviour.
		// object is an instance of the class
		// object is also called as blueprint of class
		
	}
	
	// 1. Static method
	public static void Aspire ()
	{
		// Rules applicable for class name all those rules are applicable for methodname also.
		// Can't create another method inside the method
		System.out.println(8 + 8);	
	}
	
	public static void New ()
	{
		System.out.println("Team_Aspire");
	}
	
		
	
	// 2. Non-Static method
	public void Substraction ()
	{
		System.out.println("I am in Substraction");
		System.out.println(8 - 4);
		
	}
	

}
