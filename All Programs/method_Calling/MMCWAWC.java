package method_Calling;

public class MMCWAWC
{
	//Making a method call with argument within the class 
	
	static int a= 10;
	static int b = 20;
	//Static Method
	public static void Addition (int q)
	{
		int c = a+b;  //Local Variable
		System.out.println("Addition="+c);
	}
	// Non static method
	public void Substraction (char w, int t, String u)
	{
		int c = a-b;   //Local Variable
		System.out.println("Substraction="+c);
	}
	
	public void multiplication (String r)
	{
		int c = a*b;   //Local Variable
		System.out.println("multiplication="+c);
	}
	
	public static void main(String[] args)
	{
		Addition (4);
		MMCWAWC m = new MMCWAWC();
		m.Substraction('d', 9, "ASPIRE");
		m.multiplication("demo");
	}
}
