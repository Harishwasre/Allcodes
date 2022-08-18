package operator_demo;

public class Prefix_op {
	public static void Demo ()
	{
		boolean b = true;
		System.out.println(b);
		System.out.println(!b);
		
		//~ 
		int a = -50;
		System.out.println(a);  //50
		System.out.println(~a); //-info -1  = -(-50) -1 = 49
	}
	public static void main(String[] args) 
	{
		Demo();
		int a = -12;   // Local variable
		System.out.println(a);  //12
		System.out.println(--a); //     -1 (+/-) info =-13
		System.out.println(++a);  //-12   1 (+/-) info = -12
		System.out.println(a++);
	}
}
