package switch_case;

public class Switch_Char {

	public static void main(String[] args)
	{
		
		char month = 'a';
		switch (month)
		{
		case 'a':  System.out.println("Demo 1");
		case 'b': System.out.println("Demo 2");
		}
		
		String demo ="aspire";
		// Scenario: ATM 
		// Withdraw the money --> MW,
		// Balance--> BA
		
		switch (demo)
		{
		case "BA": System.out.println("Check your balance"); break;
		case "MW": System.out.println("Withdraw the money"); break;
		default: System.out.println("You have entered wrong info");
		}
		
		
				
	}

}
