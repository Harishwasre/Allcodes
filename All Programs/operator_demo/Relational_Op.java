package operator_demo;

public class Relational_Op {
	
	int b = 3;  // Instance Variable
	
	static int c =7;  //static variable
	
	public static void main(String[] args)
	{
		int a = 10;  // Local Variable
		Relational_Op r = new Relational_Op();  // Object -->r
		
		System.out.println("Less than: " + (a<r.b)); //false   // b-->instance variable, we can't called it in static method	
		
		boolean w= (a<=r.b);  // true/false -->datatype-->boolean
		System.out.println("Less than equal to: " + w);
		
		System.out.println("Greater than: "+ (a>r.b));
		
		System.out.println("Greater than equal to: "+ (a>=c));  // Becoz C-->Static variable
		
		System.out.println("Equal to equal to: "+ (a==10));  // true
		
		System.out.println("Not equal to: " + (a!=r.b)); //true
		
	}

}
