package for_Demo;

public class While_Loop {

	public static void main(String[] args)
	{
		// Syntax: 
		//while (Condition) 
		// {
		//     Body of loop
		// }
		// Infinite iterations
		
		int a = 10;  // initialization
		while (a > 1) // Condition   10, 10-1=9-1=8........2-1=1
		{
			System.out.println("I am in while loop: "+ a);
			// increment/Decrement
			a--;
			//break;
		}
	}
}
