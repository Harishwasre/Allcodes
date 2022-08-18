package if_Satement;

public class Nested_If_else
{
	// 1.Result-->40%, 50%, 60%, 66%
	// 2.Voting 
	//    --> age>18 --> legal voter --> main condition
	//    --> age > 21 --> marriage 
	//    --> gender 
	//Nested if else
	public static void main(String[] args)  // Main method
	{
		String username = "aspir"; // local variable
		String pass = "team";      // Local variable
		
		// Scenario: Check the login functionality
		// Username, Password, Submit Button
		
		if (username == "aspir") // main Condition
		{
			System.out.println("I am satisfying main condition");
			if (pass =="tem") // Sub-condition
			{
				System.out.println("I am satisfying sub condition");
				System.out.println("Click on the submit button");
			}
			else
			{
				System.out.println("Your password is wrong");				
			}
		}
		else 
		{
			System.out.println("Your Username is incorrect");
		}
	}
}
