package constructor_demo;

public class Use_of_const {

	// Declaration
	int a;
	int b;

	// Initialization
	public Use_of_const () // Zero argument
	{
		a=10;
		b=20;
	}
	
	public Use_of_const (int a)// Parameterized
	{
		a=80;
		b=40;
	}
	
	public void addition () //Method
	{
		int c =a+b;
		System.out.println("Addition= "+ c);
	}
	
	public void substraction () //Method
	{
		int d =a-b;
		System.out.println("substraction= "+ d);
	}
	
	public static void main(String[] args)
	{
		// how to call non static method
		
		Use_of_const use = new Use_of_const();  // Zero argument -->a =10, b=20
		use.addition(); //-->30
		use.substraction(); // -->-10
		
		System.out.println("-------------");
		Use_of_const sec = new Use_of_const(2); // Parameterized -->a=80, b=40
		sec.addition(); // -->120
		sec.substraction(); //-->40

	}

}
