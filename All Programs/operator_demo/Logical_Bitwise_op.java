package operator_demo;

public class Logical_Bitwise_op
{
	// Logical operator --> AND &&   /  OR || -->Pipe
	
	// Bitwise Operator --> AND &    /  OR  | -->Pipe
	
	static int a = 100;
	static int b = 200;
	static int c = 300;
	
	public static void main(String[] args)
	{
		System.out.println("----- Logical AND && Operator----");
		System.out.println("F + F = F-->"+ (a>b && b>c)); //False
		System.out.println("F + T = F-->" + (a>b && b<c)); //False
		System.out.println("T + F = F-->"+ (a<b && b>c)); // False
		System.out.println("T + T = T-->" + (a<b && b<c)); // True
		
		
		System.out.println("----- Bitwise AND & Operator----");
		System.out.println("F + F = F-->"+ (a>b & b>c)); //False
		System.out.println("F + T = F-->" + (a>b & b<c)); //False
		System.out.println("T + F = F-->"+ (a<b & b>c)); // False
		System.out.println("T + T = T-->" + (a<b & b<c)); // True
		
		System.out.println("----- Logical OR || Operator----");
		System.out.println("F + F = F-->"+ (a>b || b>c)); //False
		System.out.println("F + T = T-->" + (a>b || b<c)); //True 
		System.out.println("T + F = T-->"+ (a<b || b>c)); // True
		System.out.println("T + T = T-->" + (a<b || b<c)); // True
		
		System.out.println("----- Bitwise OR | Operator----");
		System.out.println("F + F = F-->"+ (a>b | b>c)); //False
		System.out.println("F + T = T-->" + (a>b | b<c)); //True 
		System.out.println("T + F = T-->"+ (a<b | b>c)); // True
		System.out.println("T + T = T-->" + (a<b | b<c)); // True
	}
	

}
