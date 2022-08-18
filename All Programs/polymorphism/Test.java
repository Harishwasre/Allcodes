package polymorphism;

public class Test
// poly --> Many
// Morph --> Form
{
	// Addition (int a, int b)--> Addition
	// Add (int a, int b, int c) --> Addition
	// Four (int a, int b, int c, int d)-->Addition
	
	// 1) Compile time polymorphism
	// 2) Run time Polymorphism
	
	public static void main(String b) 
	{
		System.out.println("Team Aspire");	
	}
	public static void main(String[] args)
	{
		Complie_Time_P.Addition(4, 's');
		Complie_Time_P c= new Complie_Time_P();
		c.Addition();
		c.Addition('s');
		c.Addition(4);
		c.Addition("Aspire");
		c.Addition(4, 5);
		//c.Addition(4, 'd');
		main ("Team");
		c.main();
	}
}
