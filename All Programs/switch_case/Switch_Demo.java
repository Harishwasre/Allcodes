package switch_case;

public class Switch_Demo {

	public static void main(String[] args)
	{
		// 1 statement for multiple conditions
		// It works with byte, short, char & int 
		// It works with String 
		// Duplicate case values are not allowed.
		// We can create any number cases
		// Scenario: I want to print sunday from the list of days.
		// break keyword used to terminate the sequence
		// break & default are not mandatory
		
		int day = 9;
		switch (day) // 9
		{
		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3: System.out.println("Tuesday");
		break;
		case 4: System.out.println("Wednesday");
		break;
		case 5: System.out.println("Thursday");
		break;
		case 6: System.out.println("Friday");
		break;
		case 7: System.out.println("saturday");
		break;
		default: System.out.println("Wrong Input"); 
		}
		
		
	}
}
