package operator_demo;

public class Operator_Example
{
	int a = 10;       // Instance variable
	static int b = 5; // Static/Global variable
	
	public void Postfix ()
	{
		// exp ++
		System.out.println(a);   //10
		System.out.println(b);   //5
		
		System.out.println(a++);  // info +1   10
		// System.out.println(a++);    //11
		System.out.println("I am postfix "+ a);  //12
		
		System.out.println("I am Prefix "+ ++a);  //1+info
		
		System.out.println("----EXP-----");
		// exp --
		System.out.println(a--);  // info - 1   12
		System.out.println(a--);    //11
		System.out.println(a);  // 10
		
	}
	
	public static void main(String[] args)
	{
		Operator_Example o = new Operator_Example();
		o.Postfix();
	}
	

}
