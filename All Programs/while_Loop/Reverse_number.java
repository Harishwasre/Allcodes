package while_Loop;

public class Reverse_number {

	public static void demo ()
	{
		int number = 1215451545;  //4321
		int temp;
		int rev=0;
		int a = number;
		
		while (number != 0)
		{
			 
			rev = (rev*10) +number%10;
			number = number/10;
		}
		System.out.println("Expected number = "+ number +" "+a+ "   Actual Number="+rev);
	
	}
	public static void main(String[] args)
	{
		demo();
		
	}
}
